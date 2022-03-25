package Test;

public class TestWithAmina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double item1 = 310.99;
	double item2 = 15.5;
	double item3 = 18.3;
	double sum = item1 + item2 + item3;
	double taxRate = 2.5 / 100;
	double taxAmount = sum * taxRate;
	double shipment = sum * 10 / 100;
	double discount = sum * 3.8 / 100;
	
	if (sum > 500) {
		shipment = 0;
	} else if (sum > 300) {
		shipment = sum * 5 / 100;
	} else if (sum < 100) {
		shipment = sum * 15 / 100;
	}
	
	double grandTotal = sum + taxAmount + shipment - discount;
	
	


		
		System.out.println("****Store Reciept*****");
	
	
	System.out.println("Item 1 ..................................$" + " " + item1);
	System.out.println("Item 2 ..................................$" + " " + item2);
	System.out.println("Item 3 ..................................$" + " " + item3);
	System.out.println("This is the sum...........................$" + sum);
	
	System.out.println("****************************************************");
	System.out.println("This is the taxRate......................$" + taxRate);
	System.out.println("This is the taxAmount.....................$" + taxAmount);
	System.out.println("This is shiptment..........................$" + shipment);
	System.out.println("This is discount..........................$" + discount);
	System.out.println("***********************************************");
	
	System.out.println("Totat of all payments will be ...........$" + grandTotal);
	
	

	}
}
