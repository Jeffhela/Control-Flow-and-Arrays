
public class Evennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LIMIT = 16; //TRACE
		int count = 1; 	//sum 	nextVal 	count
		int sum = 0; 	//--- 	------- 	-----
		int nextVal = 2;
		while (sum < LIMIT)
		{
			sum = sum + nextVal;
			nextVal = nextVal + 2;
			count = count + 1;
		}
		System.out.println("Had to add together " + (count - 1) + " even numbers " +
				"to reach value " + LIMIT + ". Sum is " + sum);

	}

}
