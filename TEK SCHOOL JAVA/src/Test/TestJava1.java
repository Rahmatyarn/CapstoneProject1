package Test;

import java.util.Arrays;

public class TestJava1 {
	
	public static void main (String[] args) {
		
// Write java program to find second largest number in the array? 
// Maximum and minimum number in the array?
//		int[] num = {12,14,25,8,9,11,15,16};
//		Arrays.sort(num);
//		System.out.println(num[num.length-2]);
	
//		// more efficient way	
//	int  arr[] = {1,5,88,55,47,58,5,83,52}	;
//	int largest = arr[0];
//	int secondlargest = arr[0];
//	
//	for(int i =0; i<arr.length;i++) {
//		if(arr[i]>largest) {
//			secondlargest=largest;
//			largest=arr[i];
//		} else if (arr[i]>secondlargest) {
//			secondlargest=arr[i];
//		}
//		
//	}
//	
//	System.out.println("2nd largest number is:" + secondlargest);
//	
//	
//	// maximum and minimum number in the array
		
		int [] numArray = {-3,5,8,9,2,72,64,87,92};
		
		int min = numArray[0];
		int max = numArray[0];
		
		for(int i = 0; i < numArray.length; i++) {
			if(numArray[i]>max) {
				max=numArray[i];
				
			} else if (numArray[i]< min) {
				min = numArray[i];
			}
			
		}
		
		System.out.println(max);
		System.out.println(min);
		
		
	}

}
