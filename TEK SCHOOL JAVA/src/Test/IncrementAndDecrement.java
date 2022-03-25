package Test;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 1;
		
		
		// Know the current value of y
		// add 1 to the current value
		// assign the new value to y
		
		System.out.println(y + 1);
		
		System.out.println("Here: " + y);
		
		int z = 10;
		++z;
		--z;
		System.out.println(z);
		
		int j = 10;
		System.out.println("J at start is " + j);
		System.out.println(" J is : " + ++j);
		System.out.println(" J is pre increment:" + ++j); // pre increment
		System.out.println(" J is post increment: " + j++); //post increment
		System.out.println(" J at the end is " + j);
	}

}
