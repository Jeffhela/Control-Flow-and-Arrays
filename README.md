# Control-Flow-and-Arrays

Part 1 Writing Conditions

    Rewrite each condition below in valid Java syntax (give a boolean expression):

    x > y > z
    x and y are both less than 0
    neither x nor y is less than 0
    x is equal to y but not equal to z

    Suppose gpa is a variable containing the grade point average of a student. Suppose the goal of a program is to let a student know if he/she made the Dean’s list (the gpa must be 3.5 or above). Write an if... else... statement that prints out the appropriate message (either “Congratulations—you made the Dean’s List” or “Sorry you didn’t make the Dean’sList”).

    Complete the following program to determine the raise and new salary for an employee by adding if ... else statements to compute the raise. The input to the program includes the current annual salary for the employee and a number indicating the performance rating (0=unacceptable, 1=poor, 2=good, and 3=excellent). An employee with a rating of 1 will receive a 1.5% raise, an employee with a rating of 2 will receive a 4% raise, and one with a rating of 3 will receive a 6% raise.
    
    
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

// Print the results

System.out.println ("Amount of your raise: $" + raise);

System.out.println ("Your new salary: $" + (currentSalary + raise) );

}

}

Part 2b While Loops. execution of statements

In a while loop, execution of a set of statements (the body of the loop) continues until the boolean expression controlling the loop (the condition) becomes false. As for an if statement, the condition must be enclosed in parentheses. For example, the loop below prints the numbers from 1 to LIMIT:

final int LIMIT = 100; // setup

int count = 1;

while (count <= LIMIT) // condition

{ // body

System.out.println(count); // -- perform task

count = count + 1; // -- update condition

}

There are three parts to a loop:

    The setup, or initialization. This comes before the actual loop, and is where variables are initialized in preparation for the first time through the loop.
    The condition, which is the boolean expression that controls the loop. This expression is evaluated each time through the loop. If it evaluates to true, the body of the loop is executed, and then the condition is evaluated again; if it evaluates to false, the loop terminates.
    The body of the loop. The body typically needs to do two things:

    Do some work toward the task that the loop is trying to accomplish. This might involve printing, calculation, input and output, method calls—this code can be arbitrarily complex.
    Update the condition. Something has to happen inside the loop so that the condition will eventually be false — otherwise the loop will go on forever (an infinite loop). This code can also be complex, but often it simply involves incrementing a counter or reading in a new value.

Sometimes doing the work and updating the condition are related. For example, in the loop above, the print statement is doing work, while the statement that increments count is both doing work (since the loop’s task is to print the values of count) and updating the condition (since the loop stops when count hits a certain value).

The loop above is an example of a count-controlled loop, that is, a loop that contains a counter (a variable that increases or decreases by a fixed value—usually 1—each time through the loop) and that stops when the counter reaches a certain value.

Not all loops with counters are count-controlled; consider the example below, which determines how many even numbers must be added together, starting at 2, to reach or exceed a given limit.

final int LIMIT = 16; TRACE

int count = 1;         sum         nextVal         count

int sum = 0;         ---         -------         -----

int nextVal = 2;

while (sum < LIMIT)

{

sum = sum + nextVal;

nextVal = nextVal + 2;

count = count + 1;

}

System.out.println("Had to add together " + (count-1) + " even numbers " +

 "to reach value " + LIMIT + ". Sum is " + sum);

Note that although this loop counts how many times the body is executed, the condition does not depend on the value of count.

Not all loops have counters. For example, if the task in the loop above were simply to add together even numbers until the sum reached a certain limit and then print the sum (as opposed to printing the number of things added together), there would be no need for the counter. Similarly, the loop below sums integers input by the user and prints the sum; it contains no counter.

int sum = 0;                                                         //setup

String keepGoing = "y";

int nextVal;

while (keepGoing.equals("y") || keepGoing.equals("Y"))

{

System.out.print("Enter the next integer: ");         //do work

nextVal = scan.nextInt();

sum = sum + nextVal;

System.out.println("Type y or Y to keep going"); //update condition

keepGoing = scan.next();

}

System.out.println("The sum of your integers is " + sum);

Exercises

    In the first loop above, the println statement comes before the value of count is incremented. What would happen if you reversed the order of these statements so that count was incremented before its value was printed? Would the loop still print the same values? Explain.

    Consider the second loop above.

    Trace this loop, that is, in the table next to the code show values for variables nextVal, sum and count at each iteration. Then show what the code prints.
    Note that when the loop terminates, the number of even numbers added together before reaching the limit is count-1, not count. How could you modify the code so that when the loop terminates, the number of things added together is simply count?

    Write a while loop that will print “I love computer science!!” 100 times. Is this loop count-controlled?

    Add a counter to the third example loop above (the one that reads and sums integers input by the user). After the loop, print the number of integers read as well as the sum. Just note your changes on the example code. Is your loop now count-controlled?

    The code below is supposed to print the integers from 10 to 1 backwards. What is wrong with it? (Hint: there are two problems!) Correct the code so it does the right thing.

count = 10;

while (count >= 0)

{

System.out.println(count);

count = count + 1;

}

    Two Meanings of Plus

In Java, the symbol + can be used to add numbers or to concatenate strings. This part illustrates both uses.

When using a string literal (a sequence of characters enclosed in double quotation marks) in Java the complete string must fit on one line. The following is NOT legal (it would result in a compile-time error).

System.out.println ("It is NOT okay to go to the next line

in a LONG string!!!");

The solution is to break the long string up into two shorter strings that are joined using the concatenation operator (which is the + symbol). This is discussed in Section 2.1 in the text. So the following would be legal

System.out.println ("It is OKAY to break a long string into " +

"parts and join them with a + symbol.");

So, when working with strings the + symbol means to concatenate the strings (join them). BUT, when working with numbers the + means what it has always meant—add!

1. Observing the Behavior of +

To see the behavior of + in different settings do the following:

a. Study the program below, which is in file PlusTest.java.

// ************************************************************

// PlusTest.java

//

// Demonstrate the different behaviors of the + operator

// ************************************************************

public class PlusTest

{

// -------------------------------------------------

// main prints some expressions using the + operator

// -------------------------------------------------

public static void main (String[] args)

{

System.out.println ("This is a long string that is the " +

  "concatenation of two shorter strings.");

System.out.println ("The first computer was invented about" + 55+

  "years ago.");

System.out.println ("8 plus 5 is " + 8 + 5);

System.out.println ("8 plus 5 is " + (8 + 5)) ;

System.out.println (8 + 5 + " equals 8 plus 5.");

}

}

b. Save PlusTest.java to your directory.

c. Compile and run the program. For each of the last three output statements (the ones dealing with 8 plus 5) write down what was printed. Now for each explain why the computer printed what it did given that the following rules are used for +. Write out complete explanations.

    If both operands are numbers + is treated as ordinary addition. (NOTE: in the expression a + b the a and b are called the operands.)
    If at least one operand is a string the other operand is converted to a string and + is the concatenation operator.
    If an expression contains more than one operation expressions inside parentheses are evaluated first. If there are no parentheses the expression is evaluated left to right.

d. The statement about when the computer was invented is too scrunched up. How should that be fixed?

2. Writing Your Own Program With +

Now write a complete Java program that prints out the following sentence:

Ten robins plus 13 canaries is 23 birds.

Your program must use only one statement that invokes the println method. It must use the + operator both to do arithmetic and string concatenation.

Part 3: Painting a Room
File Paint.java contains the partial program below, which when complete will calculate the amount of paint needed to paint the walls of a room of the given length and width. It assumes that the paint covers 350 square feet per gallon.

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

//declare double totalSqFt;

//declare double paintNeeded;

//declare and initialize Scanner object

//Prompt for and read in the length of the room

//Prompt for and read in the width of the room

//Prompt for and read in the height of the room

//Compute the total square feet to be painted--think

//about the dimensions of each wall

//Compute the amount of paint needed

//Print the length, width, and height of the room and the

//number of gallons of paint needed.

}

}

Save this file to your directory and do the following:

1. Fill in the missing statements (the comments tell you where to fill in) so that the program does what it is supposed to.

Compile and run the program and correct any errors.

2. Suppose the room has doors and windows that don't need painting. Ask the user to enter the number of doors and number of windows in the room, and adjust the total square feet to be painted accordingly. Assume that each door is 20 square feet and each window is 15 square feet.

Part 4 Counting Characters

The file Count.java contains the skeleton of a program to read in a string (a sentence or phrase) and count the number of blank spaces in the string. The program currently has the declarations and initializations and prints the results. All it needs is a loop to go through the string character by character and count (update the countBlank variable) the characters that are the blank space. Since we know how many characters there are (the length of the string) we use a count controlled loop—for loops are especially well-suited for this.

1. Add the for loop to the program. Inside the for loop you need to access each individual character—the charAt method of the String class lets you do that. The assignment statement

ch = phrase.charAt(i);

assigns the variable ch (type char) the character that is in index i of the String phrase. In your for loop you can use an assignment similar to this (replace i with your loop control variable if you use something other than i). NOTE: You could also directly use phrase.charAt(i) in your if (without assigning it to a variable).

2. Test your program on several phrases to make sure it is correct.

3. Now modify the program so that it will count several different characters, not just blank spaces. To keep things relatively simple we’ll count the a’s, e’s, s’s, and t’s (both upper and lower case) in the string. You need to declare and initialize four additional counting variables (e.g. countA and so on). Your current if could be modified to cascade but another solution is to use a switch statement. Replace the current if with a switch that accounts for the 9 cases we want to count (upper and lower case a, e, s, t, and blank spaces). The cases will be based on the value of the ch variable. The switch starts as follows—complete it.

switch (ch)

{

case 'a':

case 'A':  countA++;

break;

case ....

}

Note that this switch uses the “fall through” feature of switch statements. If ch is an ‘a’ the first case matches and the switch continues execution until it encounters the break hence the countA variable would be incremented.

4. Add statements to print out all of the counts.

5. It would be nice to have the program let the user keep entering phrases rather than having to restart it every time. To do this we need another loop surrounding the current code. That is, the current loop will be nested inside the new loop. Add an outer while loop that will continue to execute as long as the user does NOT enter the phrase quit. Modify the prompt to tell the user to enter a phrase or quit to quit. Note that all of the initializations for the counts should be inside the while loop (that is we want the counts to start over for each new phrase entered by the user). All you need to do is add the while statement (and think about placement of your reads so the loop works correctly). Be sure to go through the program and properly indent after adding code—with nested loops the inner loop should be indented.

// ************************************************************

// Count.java

//

// This program reads in strings (phrases) and counts the

// number of blank characters and certain other letters

// in the phrase.

// ************************************************************

import java.util.Scanner;

public class Count

{

public static void main (String[] args)

{

String phrase; // a string of characters

int countBlank; // the number of blanks (spaces) in the phrase

int length; // the length of the phrase

char ch; // an individual character in the string

Scanner scan = new Scanner(System.in);

// Print a program header

System.out.println ();

System.out.println ("Character Counter");

System.out.println ();

// Read in a string and find its length

System.out.print ("Enter a sentence or phrase: ");

phrase = scan.nextLine();

length = phrase.length();

// Initialize counts

countBlank = 0;

// a for loop to go through the string character by character

// and count the blank spaces

// Print the results

System.out.println ();

System.out.println ("Number of blank spaces: " + countBlank);

System.out.println ();

}

}

Part V Tracking Sales
File Sales.java contains a Java program that prompts for and reads in the sales for each of 5 salespeople in a company. It then prints out the id and amount of sales for each salesperson and the total sales. Study the code, then compile and run the program to see how it works. Now modify the program as follows:

1. Compute and print the average sale. (You can compute this directly from the total; no loop is necessary.)

2. Find and print the maximum sale. Print both the id of the salesperson with the max sale and the amount of the sale, e.g., “Salesperson 3 had the highest sale with $4500.” Note that you don’t need another loop for this; you can do it in the same loop where the values are read and the sum is computed.

3. Do the same for the minimum sale.

4. After the list, sum, average, max and min have been printed, ask the user to enter a value. Then print the id of each salesperson who exceeded that amount, and the amount of their sales. Also print the total number of salespeople whose sales exceeded the value entered.

5. The salespeople are objecting to having an id of 0—no one wants that designation. Modify your program so that the ids run from 1-5 instead of 0-4. Do not modify the array—just make the information for salesperson 1 reside in array location 0, and so on.

6. Instead of always reading in 5 sales amounts, at the beginning ask the user for the number of sales people and then create an array that is just the right size. The program can then proceed as before.

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

int[] sales = new int[SALESPEOPLE];

int sum;

Scanner scan = new Scanner(System.in);

for (int i=0; i<sales.length; i++)

{

System.out.print("Enter sales for salesperson " + i + ": ");

sales[i] = scan.nextInt();

}

System.out.println("\nSalesperson Sales");

System.out.println(" ------------------ ");

sum = 0;

for (int i=0; i<sales.length; i++)

{

System.out.println(" " + i + " " + sales[i]);

sum += sales[i];

}

System.out.println("\nTotal sales: " + sum);

}

}



