package Test;

public class JavaDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Data Types in Java
		We have two data types in Java
		1 - Primitive Data Types
		boolean, byte, char, short, int, long, float, double
		---
		Numeric Types: byte, short, int, double, float: they always store numbers (whole/decimal points)
		char: we can store single letter or number;
		boolean Type: allays store true or false
		---
		2 - Non-Primitive Data Types/reference type
		String, Array etc...
		---
		String Type: stores combination of chars as a single text
		---
		byte: 1 byte of data = -128 to 127
		byte nbrByte = 127;
		//short: 2 bytes of data = -32,768 to 32,767
		short nbrShort = 32767;
		//int: 4 bytes of data = -2,147,483,648 to 2,147,483,647
		int nbrInt = 2147483647;
		//I want to store phone numbers
		//country code, area code and phone number
		int countryCode = 1;
		int areaCode = 571;
		int cellPhoneNumber = 5789;
		System.out.println(countryCode+"-"+areaCode+"-"+cellPhoneNumber);
		//long: 8 bytes of data = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		long nbrLong = 9223372036854775807L;
		//The value of all 500 fortune companies in the US
		long _500FortuneComapniesValue = 100000000000000L;
		//double: 8 bytes of data = Stores fractional numbers. Sufficient for storing 15 decimal digits
		double nbrDouble = 5.5d;
		//float: 4 bytes of data = Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		float nbrFloat = 3.9f;
		//char: 2 bytes of data = 'a', 'A', '6' or ascci value
		*/
		
		
		//I want to store phone numbers
		//Country code, area code and phone number
		
		int countrycode = 1;
		int areaCode = 571;
		int cellPhoneNumber = 5236492;
		System.out.println(countrycode+"-"+areaCode+"-"+cellPhoneNumber);
		
		//Naqib is working in a company and his annual salary is $100000
		//I want to pay his salary on bi-weekly bases
		//how much is bi-weekly paycheck?
		double annualSalary = 100000;
		double biWeeklyPaycheck = annualSalary/26;
		System.out.println(biWeeklyPaycheck);
		
		//Using Float
		//float annualSalaryFloat = 100000;
		//float biweeklysalaryFloat = annualSalaryFloat/26;
		//System.out.println(biweeklysalaryFloat);
		
		//John's Salary is $96000.52
		float annualSalaryFloat = 96000.52f;
		float weeklysalaryFloat = annualSalaryFloat/52;
		System.out.println(weeklysalaryFloat);
		//The result is 1846.164
		
		
		double annualySalary = 96000.52;
		double dailyPaycheck = annualySalary/365;
		System.out.println(dailyPaycheck);
		
		
		int x = 20;
		int y = 10;
		System.out.println(x = y);
		System.out.println(x + y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x - y);
		System.out.println(x % y);
		System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x == y);
        System.out.println(x != y);
	}

}
