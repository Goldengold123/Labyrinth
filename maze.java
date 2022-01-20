// Culminating - Story Game
// Labyrinth
// Grace Pu and Yu Wei Fu
// December 20, 2021
// ICS3UP

import java.io.*;
import java.util.*;
import java.awt.*;
import hsa.Console;

public class maze {

    // Variable Declaration Section
    static Console c;

    static int WINDOW_WIDTH = 80; // Console width
    static int WINDOW_HEIGHT = 25; // Console height
    static int FONT_SIZE = 14; // Font size
    static String TITLE = "Maze Game"; // Console title
    static Color backgroundColor = new Color(255, 255, 255); // main background colour (white)
    
    static char input;
    
    // Array for the text to display at each node.
    // This array contains arrays of text, where the text is what is to be displayed at that node.
    // Upon arriving at a node, the program will not display all the text at once, as that would be too much for the console to hold. Instead, it will display a smaller amount of text and move on when the user presses a key.
    // The contents of this array will be inserted through another method in another java file below, for organization purposes.
    static String text[][];
    
    // Adjacency array (matrix) containing boolean values that state whether 2 nodes are adjacent or not.
    // The contents of this array will be inserted through another method in another java file below, for organization purposes.
    static boolean adj[][];
    
    // Method for creating the border pattern
    public static void clearScreenWithBorderPattern() {
	c.clear();
	c.setTextColor(Color.black);
	
	// Variable Declaration Section
	int column = 0;
	int row = 472;
	
	//Width of one pattern: 32
	//Height of one pattern: 28
	while (column < 640)
	    {
		c.fillRect(column,0,4,28);
		c.fillRect(column,0,28,4);
		c.fillRect(column,row,4,28);
		c.fillRect(column,row,28,4);
		
		column += 8;
		
		c.fillRect(column,8,4,20);
		c.fillRect(column,8,12,4);
		c.fillRect(column,24,28,4);
		c.fillRect(column,row + 8,4,20);
		c.fillRect(column,row +8,12,4);
		c.fillRect(column,row + 24,28,4);
		
		column += 8;
		
		c.fillRect(column,8,4,12);
		c.fillRect(column,16,12,4);
		c.fillRect(column,row + 8,4,12);
		c.fillRect(column,row + 16,12,4);
		
		column += 8;

		c.fillRect(column,0,4,20);
		c.fillRect(column,row,4,20);

		column += 8;
	    }
	
	// Set cursor to the position where new text should begin. 
	c.setCursor(3,1);
    }
    
    // Method for clearing a specific line (i.e. print spaces on a line)
    public static void clearLine(int lineNum) {
	c.setCursor(lineNum, 0);
	c.setColor(backgroundColor);
	for (int i=0; i<WINDOW_WIDTH; i++) c.print(" ");
    }
    
    // Method for displaying the text when the user is at node n.
    public static void AtNode(int n) {
	// Variable Declaration Section
	String currentTextToDisplay;
	
	// Processing Section
	c.setTextColor(Color.black);
	for (int i=1; i<text[n].length-1; i++)
	    {
		// Clears the screen and displays the text
		clearScreenWithBorderPattern();
		currentTextToDisplay = text[n][i];
		
		// If we are to display a puzzle, call on the puzzle method (located in another java file for organization purposes).
		if (currentTextToDisplay == "PUZZLE")
		    {
			puzzles puzzle = new puzzles();
			puzzle.puzzle(n);
		    }
		// Otherwise, display a message telling the user to press a key to continue onto the next message once they have read the current message.
		else
		    {
			c.println(text[n][i]);
			c.print("\nPress a key to continue: ");
			c.getChar();
		    }
	    }
    }
    
    // Method for getting input from the user (with invalid input check).
    // Main purpose is for checking if the users input of move is valid.
    public static int getCheckInput(String prompt, boolean[] allowed) {
	// Variable Declaration Section
	int input, currentRow, allowedNum;
	
	// Input Section
	// Prompt the user for which room they want to travel to.
	c.setTextColor(Color.blue);
	c.println(prompt);
	c.setTextColor(Color.green);
	input = c.readInt();
	
	// Input and Processing Section
	// Check if the input is valid: if so, return the input value; otherwise display an error message and prompt the user again.
	while (!allowed[input]) // check if input is valid (if the number is in the adjacency array of the current node)
	    {
		// if invalid, display an error message
		c.setTextColor(Color.red);
		c.print("INVALID! ");
		c.setTextColor(Color.black);
		c.print("Press a key to try again: ");
		c.getChar();
		
		// clear error messages before asking again
		currentRow = c.getRow();
		clearLine(currentRow);
		clearLine(currentRow-1);
		c.setCursor(currentRow-1, 1);
		
		// Input Section
		// Prompt the user for which room they want to travel to.
		c.setTextColor(Color.green);
		input = c.readInt();
	    }
	
	// return the input value
	return input;
    }
    
    // Method for initializing the game.
    // Creates the game console and assign the values for the text array and the adjacency array.
    public static void initialize() {
	// Create the game console
	c = new Console(WINDOW_HEIGHT, WINDOW_WIDTH, FONT_SIZE, TITLE);
	
	// Assign the values for the text array and adjacency array using the variables from the initializeVariables class.
	// This was put into another java file for organizational purposes.
	initializeVariables variables = new initializeVariables();
	text = variables.globText;
	adj = variables.globAdj;
    }
    
    // Method for the menu of the game.
    // Calls upon the menu method in the menuClass java file.
    // This was put into another java file for organizational purposes.
    public static void menu() {
	menuClass menu = new menuClass();
	menu.menu(c);
    }
    
    // Method for the end screen of the game.
    // Calls upon the endScreen method in the endScreenClass java file.
    // This was put into another java file for organizational purposes.
    public static void endScreen() {
	endScreenClass endScreen = new endScreenClass();
	input = endScreen.endScreen(c);
	if (input == '1') runGame();
    }
    
    // Method for running the overall game
    public static void runGame() {
	// Variable Declaration Section
	int curr = 0; // current room
	boolean endGame = false; // should we end the game?
	
	// Processing Section
	// Runs the menu method.
	menu();
	
	// Processing Section
	// Main portion of the game
	while (!endGame)
	    {
		boolean[] adjRooms = adj[curr]; // adjacency list for the current room
		
		clearScreenWithBorderPattern();
		
		// Information message
		c.println("You are now in room " + curr + "."); 
		c.print("\nPress a key to continue: ");
		c.getChar();
		
		// Calls on the AtNode method since the user is at node curr.
		AtNode(curr);
		
		// Check for what to do at the current node (wait for input, or end the game)
		if (text[curr][0] == "WAIT") // wait for input
		    {
			clearScreenWithBorderPattern();
			curr = getCheckInput(text[curr][text[curr].length-1], adjRooms);
		    }
		else // end the game
		    {
			endGame = true;
			c.setTextColor(Color.blue);
			c.print("\n\nTHE END");
			c.setTextColor(Color.black);
			c.print("\n\nPress a key to continue: ");
			c.getChar();
		    }
	    }
	
	// Call on the endScreen method, as the game is now over.
	endScreen();
    }
    
    // Main method
    public static void main (String[] args) {
	initialize(); // initialize the game
	runGame(); // run the game!
    }
}
