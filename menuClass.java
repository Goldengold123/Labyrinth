import java.io.*;
import java.util.*;
import java.awt.*;
import hsa.Console;

public class menuClass {    
    public static void menu(Console c)
    {
	//Variable declaration section
	int column, row, side;
	char start;
	boolean started = false;
	
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

	//LABYRINTH
	column = 130;
	row = 180;
	side = 10;
	
	//L
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row + 4*side, 3*side, side);
	
	column += 4*side;
	
	//A
	c.fillRect(column, row+side, side, 4*side);
	c.fillRect(column+side, row, 2*side, side);
	c.fillRect(column+side, row + 2*side, 2*side, side);
	c.fillRect(column + 3*side, row + side, side, 4*side);
	
	column += 5*side;
	
	//B
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column, row + 4*side, 3*side, side);
	c.fillRect(column + 3*side, row + side, side, side);
	c.fillRect(column + 3*side, row + 3*side, side, side);
	
	column += 5*side;
	
	//Y
	c.fillRect(column, row, side, 3*side);
	c.fillRect(column + 2*side, row, side, 3*side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column+side, row + 2*side, side, 3*side);
	
	column += 4* side;
	
	//R
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column + 3*side, row+side, side, side);
	c.fillRect(column + 2*side, row + 3*side, side, side);
	c.fillRect(column + 3*side, row + 4*side, side, side);
	
	column += 5*side;
	
	//I
	c.fillRect(column, row, side, 5*side);
	
	column += 2*side;
	
	//N
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column+side, row+side, side, side);
	c.fillRect(column + 2*side, row + 2*side, side, side);
	c.fillRect(column + 3*side, row, side, 5*side);
	
	column += 5*side;
	
	//T
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column+side, row, side, 5*side);
	
	column += 4*side;
	
	//H
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column + 3*side, row, side, 5*side);
	
	//PRESS 1 TO PLAY
	column = 165;
	row = 300;
	side = 5;
	
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

	//P
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row, 3*side, side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column + 3*side, row + side, side, side);
	
	column += 5*side;
	
	//L
	c.fillRect(column, row, side, 5*side);
	c.fillRect(column, row + 4*side, 3*side, side);
	
	column += 4*side;
	
	//A
	c.fillRect(column, row+side, side, 4*side);
	c.fillRect(column+side, row, 2*side, side);
	c.fillRect(column+side, row + 2*side, 2*side, side);
	c.fillRect(column + 3*side, row + side, side, 4*side);
	
	column += 5*side;
	
	//Y
	c.fillRect(column, row, side, 3*side);
	c.fillRect(column + 2*side, row, side, 3*side);
	c.fillRect(column, row + 2*side, 3*side, side);
	c.fillRect(column+side, row + 2*side, side, 3*side);
	
	while (!started)
	    {
		start = c.getChar();
		if (start == '1')
		    {
			started = true;
		    }
	    }
    }
}
