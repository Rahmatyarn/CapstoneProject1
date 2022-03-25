package Test;

public class SelectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double item1
		//double item2
		//double item3
		double item1 = 550;
	    double item2 = 115;
	    double item3 = 128;
	    double sum = item1 + item2 + item3;
	    
	    double taxAmount = 2.5 / 100;
	    	
	    double shipment = sum * 10 / 100;
	    double discount = sum * 3.8 / 100;
	    
	    //Shipment
	    // if total > 500 = shipment is free
	    // if total > 300 and less than 500 = shipment is 5% of the total
	    // if total < 100 = shipment is 15% of total
	    
	    if(sum>=500) {
	    	shipment=0;
	    } else if (sum > 300) {
	    	shipment = (sum * 5 / 100);
	    } else if (sum < 100) {
	    	shipment = sum * 15 / 100;
	    }
	    
	    double grandTotal = sum + shipment + taxAmount - discount;
	    

	  
	    	
	    	
	    	
	    	
		System.out.println("*** Store Receipt ***");
		System.out.println();
		System.out.println("Item:");
		System.out.println("Item1 .........$" + item1);
		System.out.println("Item2 .........$" + item2);
		System.out.println("Item3 .........$" + item3);
		System.out.println();
		System.out.println("Total\t......$" + sum);
		System.out.println("Tax Amount ... $" + taxAmount);
		System.out.println("Shipment...... $" + shipment);
		System.out.println("Discount...... $" + discount);
		System.out.println();
		System.out.println("__________________________________");
		System.out.println("Grand Total... $" + grandTotal);
		
		// all of the variables that we need for this?
		
		
		
		
		
		//Store Receipt
		//
		//Items:
		//Item 1 ....$ amount
		//Item 2 ....$ amount
		//Item 3 ....$ amount
		//
		//Total .....$ the sum
		//TaxRate (%2.5)...$tax amount
		//Shipment .....$ is 10% total
		//
		//Grand Total ......$ the sum after tax and shipment
	}

}
