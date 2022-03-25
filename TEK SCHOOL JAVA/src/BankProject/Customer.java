package BankProject;

public class Customer {

	//Personal Information
	String firstname;
	String lastname;
	int age;
	int ssn;
	String dob;
	int phone;
	String email;
	// We need address
	

	Address add;
	// checking account number and password
	int checkingAccNum;
	String checkingPass;
	// default constructor
	public Customer() {
		firstname = "";
		lastname = "";
		age = 0;
		ssn = 0;
		dob = "";
		phone = 0;
		email = "";
		add = new Address();
		// checking account # and pass
		checkingPass = "";
		checkingAccNum = 0;
	}
	// Parameterized constructor
	public Customer(String newFirstName, String newLastName, int newAge, int newSSN, String newDOB, int phoneNumber,
			String newEmail, Address newAdd, String newAccountPass, int newCheckingAccNum) {
		firstname = newFirstName;
		lastname = newLastName;
		age = newAge;
		ssn = newSSN;
		dob = newDOB;
		phone = phoneNumber;
		email = newEmail;
		add = newAdd;
		// checking account # and pass
		checkingPass = newAccountPass;
		checkingAccNum = newCheckingAccNum;
	}
	// toString method so we can print the values of the a customer object the way
	// we want
	public String toString() {
		// 123-12-1234
		String strSSN = "" + ssn;
		//101224444
		//012345678
		String formattedSSN = strSSN.substring(0, 3) + "-" + strSSN.substring(3, 5) + "-" +  strSSN.substring(5, 9);
		String strPhone = "" + phone;
		//2027546585
		//0123456789
		String formattedPhone = "+1 (" + strPhone.substring(0,3) + ")" + strPhone.substring(3,6) + "-" + strPhone.substring(6,10);
		return "****************************************************\n" + "Customer: " + firstname + " " + lastname
				+ ", SSN: " + formattedSSN + "\n" + "Age: " + age + ", Date Of Birth: " + dob + "\n" + "Phone: "
				+ formattedPhone + ", Email: " + email + "\n" + add + "\n---------------------\n"
				+ "Checking Account Number: " + checkingAccNum + ", Password: " + checkingPass
				+ "\n****************************************************\n";
	}
}
		

