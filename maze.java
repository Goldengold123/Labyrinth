import java.awt.*;
import java.io.*;
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
    static String text[][] =
	{
	    {""},
	    {"1a", "1b", "1c", "1d", "1e"},
	    {"2a", "2b", "2c", "2d", "2e"},
	    {"3a", "3b", "3c", "3d", "3e"},
	    {"4a", "4b", "4c", "4d", "4e"},
	    {"5a", "5b", "5c", "5d", "5e"}
	};

    // Method for clearing a specific line (print spaces on a line)
    public static void clearLine(int lineNum) {
	c.setCursor(lineNum, 0);
	c.setColor(backgroundColor);
	for (int i=0; i<WINDOW_WIDTH; i++) c.print(" ");
    }
    
    
    // Method for displaying the text when the user is at node n.
    public static void AtNode(int n) {
	for (int i=0; i<text[n].length; i++)
	{
	    clearLine(5);
	    c.setCursor(5, 5);
	    c.println(text[n-1][i]);
	    c.println("Press a key to continue: ");
	    c.getChar();
	}
    }
    
    public static void main (String[] args) {
	c = new Console(WINDOW_HEIGHT, WINDOW_WIDTH, FONT_SIZE, TITLE);
	boolean adj[][] = {{false, false, false, false, false}, {false, true, true, false, false}, {true, false, false, true, true}, {true, false, false, true, false}, {false, true, true, false, false}, {false, true, false, false, false}};
	int curr = 1;
	while (curr != 5) {
	    boolean[] adjRooms = adj[curr];
	    c.print("You can go to rooms ");
	    for (int i=0; i<5; i++) {
		boolean room = adjRooms[i];
		if (room) c.print(i+1 + " ");
	    }
	    c.println();
	    c.print("Enter the room number you want to go to: ");
	    curr = c.readInt();
	    c.println();
	    c.print("You are now in room " + curr);
	    AtNode(curr);
	    c.clear();
	}
    }
}
