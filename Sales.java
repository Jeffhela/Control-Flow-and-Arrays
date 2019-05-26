// ***************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ***************************************************************
import java.util.Scanner;

public class Sales
{
	public static void main(String[] args)
	{
		final int SALESPEOPLE = 5;
		System.out.print("Enter number of salesPeople: ");
		int[] sales = new int[SALESPEOPLE];
		int sum, maxSales, maxIndex, minSales, minIndex;
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<sales.length; i++)
		{
			System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
			sales[i] = scan.nextInt();
		}
		System.out.println("\nSalesperson Sales");
		System.out.println(" ------------------ ");
		sum = 0;
		maxSales = 0;
		maxIndex = 0;
		minSales = 9999999;
		minIndex = 0;
		for (int i= 0; i<sales.length; i++)
		{
			System.out.println(" " + i + " " + sales[i]);
			sum += sales[i];
			//max sales
			if ( sales[i] > maxSales)
			{
				maxSales =sales [i];
				maxIndex = i;
			}
		}
		System.out.println("\nTotal sales: " + sum);
		double average =sum /sales.length;
		
		System.out.println("Salesperson " + (maxIndex + 1) + " had the highest sales with $");
	}
}
