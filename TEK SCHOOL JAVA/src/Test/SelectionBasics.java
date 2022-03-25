package Test;

public class SelectionBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*grading example
		
		//0 - 100
		// 90 - 100 A
		// 80 - 90 B
		// 70 - 80 C
		// 60 - 70 D
		// <60 = F
		
		double grade = 59.8;
		
		if (grade <= 60) {
			System.out.println("Fail");
		} else if (grade <= 70) {
			System.out.println("D");
		} else if (grade <= 80) {
			System.out.println("C");
		} else if (grade <= 90) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}
	}
		}
		End of first example */
		
		double Total = 2400;
		double interest = 0;
		System.out.println(Total);
		
		// check to see if the total is within these ranges and change interest based on that
		// if total is more than 3500, then check to see if the number is odd or even
		// for odd, interest = 5.5
		// for even, interest = 6.5
		// for totals 2500 - 3500, interest should be 3.5
		// for totals 900 - 2500, interest should be 2.5
		// for totals 500 - 900, interest should be 1.5
		// for totals 100 - 500, interest should be 1.0
		
		if(Total >= 3500) {
			// for odd, interest 5.5
			// for even, interest 6.5
		 
		} else if (Total >= 2500) {
			//interest should be 3.5
			interest = Total * 0.035;			
			System.out.println("Your total was" + Total + "Which added with internest 3.5%(" + interest + ") is going to be"
				+ (Total + interest ));
		} else if (Total >= 900) {
			interest = Total * 0.025;			
			System.out.println("Your total was" + Total + "Which added with internest 3.5%(" + interest + ") is going to be"
				+ (Total + interest ));
			
		} else if (Total >= 500) {
			interest = Total * 0.015;			
			System.out.println("Your total was" + Total + "Which added with internest 3.5%(" + interest + ") is going to be"
				+ (Total + interest ));
			
			
		} else if (Total >= 100) {
			interest = Total * 0.01;			
			System.out.println("Your total was" + Total + "Which added with internest 3.5%(" + interest + ") is going to be"
				+ (Total + interest ));

		} else {
			
			interest = Total * 0.0;			
			System.out.println("Your total was" + Total + "Which added with internest 3.5%(" + interest + ") is going to be"
				+ (Total + interest ));
		}
		
		
		
		
	
		
		
	}
}
		
		
	
        

            

		
		
	

