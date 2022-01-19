import java.io.*;
import java.util.*;
import java.awt.*;
import hsa.Console;

public class maze {
    static Console c;
    
    static int WINDOW_WIDTH = 80;
    static int WINDOW_HEIGHT = 25;
    static int FONT_SIZE = 14;
    static String TITLE = "Maze Game";
    
    static Color backgroundColor = new Color(255, 255, 255);

    
    // Array for the text to display at each node.
    // This array contains arrays of text, where the text is what is to be displayed at that node.
    // Upon arriving at a node, the program will not display all the text at once, as that would be too much for the user to handle. Instead, it will display a smaller amount of text and move on when the user presses a key.
    static String text[][];
    
    // Adjacency array containing boolean values that state whether 2 nodes are adjacent or not.
    static boolean adj[][];
	
    // Method for creating the border pattern
    public static void clearScreenWithBorderPattern() {
	c.clear();
	c.setTextColor(Color.black);
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
	    
	c.setCursor(3,1);
    }
    
    // Method for clearing a specific line (print spaces on a line)
    public static void clearLine(int lineNum) {
	c.setCursor(lineNum, 0);
	c.setColor(backgroundColor);
	for (int i=0; i<WINDOW_WIDTH; i++) c.print(" ");
    }
    
    // Method for displaying the text when the user is at node n.
    public static void AtNode(int n) {
	String currentTextToDisplay;
	c.setTextColor(Color.black);
	for (int i=1; i<text[n].length-1; i++)
	    {
		clearScreenWithBorderPattern();
		currentTextToDisplay = text[n][i];
		if (currentTextToDisplay == "PUZZLE")
		    {
			puzzles puzzle = new puzzles();
			puzzle.puzzle(n);
		    }
		else
		    {
			c.println(text[n][i]);
			c.print("\nPress a key to continue: ");
			c.getChar();
		    }
	    }
    }
    
    // Method for getting input from the user (with invalid input check).
    public static int getCheckInput(String prompt, boolean[] allowed) {
	int input, currentRow, allowedNum;
	c.setTextColor(Color.blue);
	c.print(prompt);
	input = c.readInt();
	while (!allowed[input])
	    {
		c.setTextColor(Color.red);
		c.print("INVALID! ");
		c.setTextColor(Color.black);
		c.print("Press a key to try again: ");
		c.getChar();
		currentRow = c.getRow();
		clearLine(currentRow);
		clearLine(currentRow-1);
		c.setCursor(currentRow-1, 1);
		c.print(prompt);
		input = c.readInt();
	    }
	return input;
    }
    
    public static void initialize() {
	c = new Console(WINDOW_HEIGHT, WINDOW_WIDTH, FONT_SIZE, TITLE);
	initializeVariables variables = new initializeVariables();
	text = variables.globText;
	adj = variables.globAdj;
    }
    
    public static void menu() {
	menuClass menu = new menuClass();
	menu.menu(c);
    }
    
    public static void main (String[] args) {
	initialize();
	menu();
	int curr = 0;
	while (true) {
	    boolean[] adjRooms = adj[curr];
	    clearScreenWithBorderPattern();
	    c.println("You are now in room " + curr + ".");
	    c.print("\nPress a key to continue: ");
	    c.getChar();
	    AtNode(curr);
	    if (text[curr][0] == "WAIT")
		{
		    clearScreenWithBorderPattern();
		    curr = getCheckInput(text[curr][text[curr].length-1], adjRooms);
		}
	    else if (curr == 23)
		{
		    c.setTextColor(Color.green);
		    c.print("\n\nTHE END");
		    break;
		}
	    else if (text[curr][0] == "END")
		{
		    c.setTextColor(Color.red);
		    c.print("\n\nTHE END");
		    break;
		}
	}
    }
}
