package Test;

public class SelectionReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		double total = 2555;
		double interest = 0;
		
		if ( total >= 2500) {
			interest = total * 0.035;
			System.out.println("your total was " + total + " which added with interest 3.5%("+interest+ ") is going to be " + (total + interest));
		} else if (total >= 900) {
			interest = 2.5;
			System.out.println("The interest will be " + interest + "Which will be" +  interest * total / 100 + " and total of " + total + interest);
		} else if (total >= 500) {
			interest = 1.5;
			System.out.println("The interest will be " + interest + "Which will be" +  interest * total / 100 + " and total of " + total + interest);
		} else if (total >= 100) {
			interest = 1.0;
			System.out.println("The interest will be " + interest + "Which will be" +  interest * total / 100 + " and total of " + total + interest);
		} else {
			interest = 0;
			System.out.println("The interest will be " + interest + "Which will be" +  interest * total / 100 + " and total of " + total + interest);
		}
		
		
		
		
		
		
		
		
	}

}
