import java.io.*;
import java.util.*;
import java.awt.*;
import hsa.Console;

public class puzzles {
    static Console c;
    
    static int WINDOW_HEIGHT;
    static int WINDOW_WIDTH;
    static int FONT_SIZE;
    static String TITLE;
    
    static Color backgroundColor = new Color(255, 255, 255);
    
    public static void answerPuzzle(int correct, String prompt) {
	int input;
	c.print(prompt);
	input = c.readInt();
	while (input != correct)
	    {
		c.setTextColor(Color.red);
		c.print("INCORRECT! Press a key to try again: ");
		c.getChar();
		c.clear();
		c.setTextColor(Color.black);
		c.print(prompt);
		input = c.readInt();
	    }
    }
    
    public static void newConsole(int height, int width, int fontSize, String title) {
	c = new Console(height, width, fontSize, title);
    }
    
    public static void puzzle14() {
	WINDOW_HEIGHT = 10;
	WINDOW_WIDTH = 41;
	FONT_SIZE = 14;
	TITLE = "Puzzle";
	newConsole(WINDOW_HEIGHT, WINDOW_WIDTH, FONT_SIZE, TITLE);
	answerPuzzle(13, "If it takes 13 beasts 13 minutes to kill 13 mortals, how many beasts are required to kill 65 mortals in 65 minutes? ");
	c.setTextColor(Color.green);
	c.print("Correct! Press a key to try again: ");
	c.getChar();
	c.close();
    }
    
    public static void main (String[] args) {
	puzzle14();
    }
}
