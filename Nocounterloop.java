
public class Nocounterloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; 							//setup
		String keepGoing = "y";
		int nextVal;
		while (keepGoing.equals("y") || keepGoing.equals("Y"))
		{
			System.out.print("Enter the next integer: "); 	//do work
			nextVal = scan.nextInt();
			sum = sum + nextVal;
			System.out.println("Type y or Y to keep going"); //update condition
			keepGoing = scan.next();
		}
		System.out.println("The sum of your integers is " + sum);

	}

}
