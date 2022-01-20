import java.io.*;
import java.util.*;
import java.awt.*;
import hsa.Console;

public class endScreenClass {    
    public static char endScreen(Console c)
    {
	//Variable declaration section
	int column, row, side;
	char input = 'X';
	boolean ended = false;
	
	//Background color
	Color burnt = new Color(209, 131, 36);
	c.setColor(burnt);
	c.fillRect(0,0,800,500);
	
	//Pattern
	c.setColor(Color.black);
	column = 0;
	row = 472;
	side = 4;
	
	while (column < 640)
	    {
		c.fillRect(column,0,side,7*side);
		c.fillRect(column,0,7*side,side);
		c.fillRect(column,row,side,7*side);
		c.fillRect(column,row,7*side,side);
		
		column += 8;
		
		c.fillRect(column,8,side,5*side);
		c.fillRect(column,8,3*side,side);
		c.fillRect(column,24,7*side,side);
		c.fillRect(column,row + 8,side,5*side);
		c.fillRect(column,row +8,3*side,side);
		c.fillRect(column,row + 24,7*side,side);
		
		column += 8;
		
		c.fillRect(column,8,side,3*side);
		c.fillRect(column,16,3*side,side);
		c.fillRect(column,row + 8,side,3*side);
		c.fillRect(column,row + 16,3*side,side);
		
		column += 8;

		c.fillRect(column,0,4,20);
		c.fillRect(column,row,4,20);

		column += 8;
	    }
	    
	
	//MADE BY GRACE AND YU WEI
	column = 72;
	row = 100;
	side = 8;
	
	//M
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column + side, row + side, side, side);
	c.fillRect(column + 2*side, row + 2*side, side, side);
	c.fillRect(column + 3*side, row + side, side, side);
	c.fillRect(column + 4*side, row, side, 5*side);
	
	column += 6*side;
	
	//A
	c.fillRect(column, row+side, side, 4*side);
	c.fillRect(column+side, row, 2*side, side);
	c.fillRect(column+side, row + 2*side, 2*side, side);
	c.fillRect(column + 3*side, row + side, side, 4*side);
	
	column += 5*side;
	
	//D
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 4*side, 3*side, side);
	c.fillRect(column + 3*side, row + side, side, 3*side);
	
	column += 5*side;
	
	//E + space
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column, row + 4*side, 3*side, side);
	
	column += 7*side;
	
	//B
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column, row + 4*side, 3*side, side);
	c.fillRect(column + 3*side, row + side, side, side);
	c.fillRect(column + 3*side, row + 3*side, side, side);
	
	column += 5*side;
	
	//Y + space
	c.fillRect(column, row, side, 3*side);
	c.fillRect(column + 2*side, row, side, 3*side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column+side, row + 2*side, side, 3*side);
	
	column += 7* side;
	
	//G
	c.fillRect(column + side, row, 3*side, side);
	c.fillRect(column, row + side, side, 3*side);
	c.fillRect(column + side, row + 4*side, 3*side, side);
	c.fillRect(column + 3*side, row + 2*side, side, 2*side);
	c.fillRect(column + 2*side, row + 2*side, side, side);
	
	column += 5*side;
	
	//R
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column + 3*side, row+side, side, side);
	c.fillRect(column + 2*side, row + 3*side, side, side);
	c.fillRect(column + 3*side, row + 4*side, side, side);
	
	column += 5*side;
	
	//A
	c.fillRect(column, row+side, side, 4*side);
	c.fillRect(column+side, row, 2*side, side);
	c.fillRect(column+side, row + 2*side, 2*side, side);
	c.fillRect(column + 3*side, row + side, side, 4*side);
	
	column += 5*side;
	
	//C
	c.fillRect(column + side, row, 3*side, side);
	c.fillRect(column, row + side, side, 3*side);
	c.fillRect(column + side, row + 4*side, 3*side, side);
	
	column += 5*side;
	
	//E + space
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column, row + 4*side, 3*side, side);
	
	column += 7*side;
	
	//New line
	column = 156;
	row += 6*side;
	
	//A
	c.fillRect(column, row+side, side, 4*side);
	c.fillRect(column+side, row, 2*side, side);
	c.fillRect(column+side, row + 2*side, 2*side, side);
	c.fillRect(column + 3*side, row + side, side, 4*side);
	
	column += 5*side;
	
	//N
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column+side, row+side, side, side);
	c.fillRect(column + 2*side, row + 2*side, side, side);
	c.fillRect(column + 3*side, row, side, 5*side);
	
	column += 5*side;
	
	//D + space
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 4*side, 3*side, side);
	c.fillRect(column + 3*side, row + side, side, 3*side);
	
	column += 8*side;
	
	//Y
	c.fillRect(column, row, side, 3*side);
	c.fillRect(column + 2*side, row, side, 3*side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column+side, row + 2*side, side, 3*side);
	
	column += 4* side;
	
	//U + space
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column + 3*side, row, side, 5*side);
	c.fillRect(column, row + 4*side, 3*side, side);
	
	column += 7*side;
	
	//W
	c.fillRect(column, row, side, 4*side);
	c.fillRect(column + 4*side, row, side, 4*side);
	c.fillRect(column + side, row + 4*side, side, side);
	c.fillRect(column + 2*side, row + 3*side, side, side);
	c.fillRect(column + 3*side, row + 4*side, side, side);
	
	column += 6*side;
	
	//E
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column, row + 4*side, 3*side, side);
	
	column += 4*side;
	
	//I
	c.fillRect(column, row, side, 5*side);
	
	//PRESS 1 TO RETURN TO MAIN MENU
	column = 50;
	row = 250;
	side = 4;
	
	//P
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column + 3*side, row + side, side, side);
	
	column += 5*side;
	
	//R
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column + 3*side, row+side, side, side);
	c.fillRect(column + 2*side, row + 3*side, side, side);
	c.fillRect(column + 3*side, row + 4*side, side, side);
	
	column += 5*side;
	
	//E
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column, row + 4*side, 3*side, side);
	
	column += 4*side;
	
	//S
	c.fillRect(column, row+side, side, side);
	c.fillRect(column, row + 4*side, 3*side, side);
	c.fillRect(column+side, row, 3*side, side);
	c.fillRect(column+side, row + 2*side, 2*side, side);
	c.fillRect(column + 3*side, row + 3*side, side, side);
	
	column += 5*side;
	
	//S + space
	c.fillRect(column, row+side, side, side);
	c.fillRect(column, row + 4*side, 3*side, side);
	c.fillRect(column+side, row, 3*side, side);
	c.fillRect(column+side, row + 2*side, 2*side, side);
	c.fillRect(column + 3*side, row + 3*side, side, side);
	
	column += 8*side;

	//1 + space
	c.fillRect(column, row, 2*side, side);
	c.fillRect(column + side, row, side, 5*side);
	c.fillRect(column, row + 4*side, 3*side, side);
	
	column += 7*side;
	
	//T
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column+side, row, side, 5*side);
	
	column += 4*side;
	
	//O + space
	c.fillRect(column, row+side, side, 3*side);
	c.fillRect(column + 3*side, row+side, side, 3*side);
	c.fillRect(column + side, row, 2*side, side);
	c.fillRect(column+side, row + 4*side, 2*side, side);
	
	column += 7*side;
	
	//R
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column + 3*side, row+side, side, side);
	c.fillRect(column + 2*side, row + 3*side, side, side);
	c.fillRect(column + 3*side, row + 4*side, side, side);
	
	column += 5*side;
	
	//E
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column, row + 4*side, 3*side, side);
	
	column += 4*side;
	
	//T
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column+side, row, side, 5*side);
	
	column += 4*side;
	
	//U
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column + 3*side, row, side, 5*side);
	c.fillRect(column, row + 4*side, 3*side, side);
	
	column += 5*side;
	
	//R
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column + 3*side, row+side, side, side);
	c.fillRect(column + 2*side, row + 3*side, side, side);
	c.fillRect(column + 3*side, row + 4*side, side, side);
	
	column += 5*side;
	
	//N + space
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column+side, row+side, side, side);
	c.fillRect(column + 2*side, row + 2*side, side, side);
	c.fillRect(column + 3*side, row, side, 5*side);
	
	column += 8*side;
	
	//T
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column+side, row, side, 5*side);
	
	column += 4*side;
	
	//O + space
	c.fillRect(column, row+side, side, 3*side);
	c.fillRect(column + 3*side, row+side, side, 3*side);
	c.fillRect(column + side, row, 2*side, side);
	c.fillRect(column+side, row + 4*side, 2*side, side);
	
	column += 7*side;

	//M
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column + side, row + side, side, side);
	c.fillRect(column + 2*side, row + 2*side, side, side);
	c.fillRect(column + 3*side, row + side, side, side);
	c.fillRect(column + 4*side, row, side, 5*side);
	
	column += 6*side;
	
	//A
	c.fillRect(column, row+side, side, 4*side);
	c.fillRect(column+side, row, 2*side, side);
	c.fillRect(column+side, row + 2*side, 2*side, side);
	c.fillRect(column + 3*side, row + side, side, 4*side);
	
	column += 5*side;
	
	//I
	c.fillRect(column, row, side, 5*side);
	
	column += 2*side;
	
	//N + space
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column+side, row+side, side, side);
	c.fillRect(column + 2*side, row + 2*side, side, side);
	c.fillRect(column + 3*side, row, side, 5*side);
	
	column += 8*side;
	
	//M
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column + side, row + side, side, side);
	c.fillRect(column + 2*side, row + 2*side, side, side);
	c.fillRect(column + 3*side, row + side, side, side);
	c.fillRect(column + 4*side, row, side, 5*side);
	
	column += 6*side;
	
	//E
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column, row + 4*side, 3*side, side);
	
	column += 4*side;
	
	//N
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column+side, row+side, side, side);
	c.fillRect(column + 2*side, row + 2*side, side, side);
	c.fillRect(column + 3*side, row, side, 5*side);
	
	column += 5*side;
	
	//U
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column + 3*side, row, side, 5*side);
	c.fillRect(column, row + 4*side, 3*side, side);
	
	//PRESS 2 TO QUIT
	column = 50;
	row = 300;
	
	//P
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column + 3*side, row + side, side, side);
	
	column += 5*side;
	
	//R
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column + 3*side, row+side, side, side);
	c.fillRect(column + 2*side, row + 3*side, side, side);
	c.fillRect(column + 3*side, row + 4*side, side, side);
	
	column += 5*side;
	
	//E
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column, row + 4*side, 3*side, side);
	
	column += 4*side;
	
	//S
	c.fillRect(column, row+side, side, side);
	c.fillRect(column, row + 4*side, 3*side, side);
	c.fillRect(column+side, row, 3*side, side);
	c.fillRect(column+side, row + 2*side, 2*side, side);
	c.fillRect(column + 3*side, row + 3*side, side, side);
	
	column += 5*side;
	
	//S + space
	c.fillRect(column, row+side, side, side);
	c.fillRect(column, row + 4*side, 3*side, side);
	c.fillRect(column+side, row, 3*side, side);
	c.fillRect(column+side, row + 2*side, 2*side, side);
	c.fillRect(column + 3*side, row + 3*side, side, side);
	
	column += 8*side;
	
	//2 + space
	c.fillRect(column, row + side, side, side);
	c.fillRect(column + side, row, 2*side, side);
	c.fillRect(column + 3*side, row + side, side, side);
	c.fillRect(column + 2*side, row + 2*side, side, side);
	c.fillRect(column + side, row + 3*side, side, side);
	c.fillRect(column, row + 4*side, 4*side, side);
	
	column += 8*side;
	
	//T
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column+side, row, side, 5*side);
	
	column += 4*side;
	
	//O + space
	c.fillRect(column, row+side, side, 3*side);
	c.fillRect(column + 3*side, row+side, side, 3*side);
	c.fillRect(column + side, row, 2*side, side);
	c.fillRect(column+side, row + 4*side, 2*side, side);
	
	column += 7*side;
	
	//Q
	c.fillRect(column, row+side, side, 3*side);
	c.fillRect(column + side, row, 2*side, side);
	c.fillRect(column + 3*side, row+side, side, 4*side);
	c.fillRect(column + 2*side, row + 3*side, side, 2*side);
	c.fillRect(column + side, row + 4*side, side, side);
	
	column += 5*side;
	
	//U
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column + 3*side, row, side, 5*side);
	c.fillRect(column, row + 4*side, 3*side, side);
	
	column += 5*side;
	
	//I
	c.fillRect(column, row, side, 5*side);
	
	column += 2*side;
	
	//T
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column+side, row, side, 5*side);
	
	column += 4*side;
	
	while (!ended)
	    {
		input = c.getChar();
		if (input == '1' || input == '2')
		    {
			ended = true;
		    }
	    }
	
	return input;
    }
}
