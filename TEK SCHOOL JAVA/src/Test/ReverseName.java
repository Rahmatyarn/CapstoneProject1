package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ReverseName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	How to find out the part of the string from a string? What is substring? Find number of words in string?
		
//		String Stu = "All students will get an offer";
//		
//		System.out.println(Stu.substring(4));
//		
//		String [] str = Stu.split(" ");
//		System.out.println(str.length);
//		
//		for (String students : str) {
//			System.out.print(" " + students);
//			
//		}
		
	//	Write java program to reverse String? Reverse integer? Reverse a string word by word?
		
//		String stu = "TEK Schooll will make us crazy";
//		
//		StringBuffer a = new StringBuffer(stu);
//		
//		System.out.println(a.reverse());
		
		
		String a = "Hello Everyone hope you are doing well";
		
		String reverse = "";
		
		for(int i = a.length()-1; i >= 0; i--) {
			reverse=reverse+a.charAt(i);
		}
	    System.out.println(reverse);
		
		 
		 
//		int x = 456;
		
//	//	String num = String.valueOf(x);
//		StringBuffer sb = new StringBuffer(String.valueOf(x));
//		System.out.println(sb.reverse());
		
//		String convert = String.valueOf(x);
//		
//		for (int i = convert.length()-1; i >=0; i--) {
//			System.out.print(convert.charAt(i));
//		}
		
//		int currentNum = 3456;
//		
//		int reverse = 0;
//		
//		while(currentNum!=0) {
//			reverse=reverse*10+currentNum%10; 
//			currentNum=currentNum/10;
//		}
//		System.out.println(reverse);
//		
	//	6. Write a program to sort array in ascending order?
		
	//	int [] x = {5,4,8,9,10,12,1};
		
	//	Arrays.sort(x);
	//	System.out.println(Arrays.toString(x));
		
	//	7. How can you convert a String into an array? Array to String?		
		
//		String s = "Hello Students";
//		
//		char[] array = s.toCharArray();
//		System.out.println(array.length);
//		for (int i = 0; i <array.length; i++) {
//			System.out.print(array[i]);
//		}
//		How to convert array to string?
//		int [] a = {5,7,8,9};
//		
//		System.out.println(Arrays.toString(a));
		
	//	8. Verify whether given two strings are equal?
//		String a = "Hello";
//		String b = "hello";
//		
//		if(a.equals(b)) {
//			System.out.println("String" +a+ "and String "+b+" are equal");
//			
//		} else {
//			System.out.println("String" +a+ " and String " +b+" are not equal");
//		}
//		
//		System.out.println(a.equalsIgnoreCase(b));
		
	//	10. How can you remove all duplicates from ArrayList?
				ArrayList aList = new ArrayList();
				aList.add("John");
				aList.add("Jane");
				aList.add("James");
				aList.add("Jasmine");
				aList.add("Jane");
				aList.add("James");
		
				HashSet set = new HashSet(aList);
				System.out.println(set);
		
//		2. Way
		
		HashSet hset = new HashSet();
		for (Object name : aList) {
			hset.add(name);
			}
		System.out.println(hset);
				
		}

}
