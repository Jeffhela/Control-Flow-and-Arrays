// ************************************************************
// Salary.java
// Computes the raise and new salary for an employee
// ************************************************************
import java.util.Scanner;
public class Salary
{
	public static void main (String[] args)
	{
		double currentSalary; // current annual salary
		int rating; // performance rating   (0 to 3)
		double raise; // dollar amount of the raise
		Scanner scan = new Scanner(System.in);

		// Get the current salary and performance rating
		System.out.print ("Enter the current salary: ");
		currentSalary = scan.nextDouble();
		System.out.print ("Enter the performance rating: ");
		rating = scan.nextInt();

		// Compute the raise -- Use if ... else ...
		//performance rating (0=unacceptable, 1=poor, 2=good, and 3=excellent)
		//rating of 1 will receive a 1.5% raise,rating of 2 will receive a 4% raise,rating of 3 will receive a 6% raise
		if(rating == 3)
		{
			raise = currentSalary * 0.06; // don't use %. % means modulus
		}
		else if(rating == 2)
		{
			raise = currentSalary * 0.04;
		}
		else if(rating == 1)
		{
			raise = currentSalary * 0.015;
		}
		else if (rating ==0)
		{
			raise = 0;
		}
		else
		{
			System.out.println ("\nError.Invalid value.\n");
			raise = 0;
			return; //end the method
		}
		// Print the results
		System.out.println ("Amount of your raise: $" + raise);
		System.out.println ("Your new salary: $" + (currentSalary + raise) );
	}
}
