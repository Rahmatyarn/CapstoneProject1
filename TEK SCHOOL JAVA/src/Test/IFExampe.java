package Test;

public class IFExampe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double total = 80;
		double interest = 0;
		System.out.println(total);
		
		// check to see if the total is within these ranges and change interest based on that
		// if total is more than 3500, then check to see if the number is odd or even
		// for odd, interest = 5.5
		// for even, interest = 6.5
		// for totals 2500 - 3500, interest should be 3.5
		// for totals 900 - 2500, interest should be 2.5
		// for totals 500 - 900, interest should be 1.5
		// for totals 100 - 500, interest should be 1.0
		
		if (total <= 3500) {
			System.out.println("Interest Rate" + 3.5);
	    } else if (total <= 2500) {
	    	
	    }

}
}
