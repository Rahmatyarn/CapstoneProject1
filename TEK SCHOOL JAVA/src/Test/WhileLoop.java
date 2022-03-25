package Test;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double balance = 5500; //beginning balance
		double payment1 = 300; // the amount i pay every cycle
		
		int numberOfPayments = 0; // this is to keep track of the number of payments
		
		while (balance > 0) {
			numberOfPayments++;
			if (payment1 > balance) {
				payment1 = balance;
				
			}
			
			System.out.println(numberOfPayments + "= balance " + balance + " - " + payment1 + " = " 
			+ (balance - payment1) + " is the balance after payment"); // print the whole thing
		
			balance = (balance - payment1); // update the balance and deduct the payment that was made
			
		}
		
		
		
		System.out.println(numberOfPayments); //print the nubmer of payments made at the end
		
		
		// How to find the number of payments
		double balance3 = 5500;
		double numberOfPayment = 300;
		System.out.println(balance3/numberOfPayment);
		
				
	
		
		
		 }
			
		
		}
	


