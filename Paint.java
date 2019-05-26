//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************

import java.util.Scanner;
public class Paint
{
	public static void main(String[] args)
	{
		final int COVERAGE = 350; //paint covers 350 sq ft/gal
		
		//declare integers length, width, and height;
		int length, width, height;

		//declare double totalSqFt;
		//declare double paintNeeded;
		double totalSqFt = 0.0, paintNeeded ;
		
		//declare and initialize Scanner object
		Scanner scan = new Scanner (System.in);
		
		//Prompt for and read in the length of the room
		System.out.print("Enter room length: ");
		length = scan.nextInt();
		
		//Prompt for and read in the width of the room
		System.out.print("Enter room width: ");
		width = scan.nextInt();
		
		//Prompt for and read in the height of the room
		System.out.print("Enter room height: ");
		height = scan.nextInt();
		
		//about the dimensions of each wall
		//Compute the total square feet to be painted--think
		System.out.print(2 * (length * height) + 2 *(height * width));
		length = scan.nextInt();
		//Compute the amount of paint needed
		paintNeeded = totalSqFt/COVERAGE ;
		
		//Print the length, width, and height of the room and the
		//number of gallons of paint needed.
		System.out.print("Rounded up: " + Math.ceil(3.1));
	}
}
