package Test;

public class TwoDimensionalArraysssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int [] d = new int [5];
		
		int sum = 0;
		
		d [0] = 5;
		d [1] = 52;
		d [2] = 35;
		d [3] = 18;
		d [4] = 51;
		
		for ( int j = 0; j < d.length; j++) {
			
			sum += d[j];
			System.out.println(sum);
		}
		
		String [][] data = new String [5] [4];
		System.out.println(data.length);
		System.out.println(data[2].length);
		System.out.println(data[1].length); 
		
		        // 12 25 15
				// 14 85 41
				// 78 97 42
				// 74 85 41
		
		int a[][] = { {12,25,15}, {14,85,41}, {78,97,42}, {74,85,41} };
		
		
		for (int i=0; i<a.length; i++) {
			
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+ "  ");
			}
			System.out.println("-------------------------------------------------------"); */
		
	
			
			// create a two dimension array with name nums with data type of int with size of 10 x 10
			// then create a two dimension loop that goes through the array and assign a value to each index
			// the values should be 1 - 100 on first row
			// 201 - 300 on the second row
			// etc... 	
			// nums[i][j] = 1;
			
			// when its done, create another nested loop to go through and print it

				int[][] nums = new int[10][10]; // creating an array on in 10x10
				int number = 1; // creating an int starting from 1
				for (int i = 0; i < nums.length; i++) { // looping through all of the rows
					for (int j = 0; j < nums[i].length; j++) { // looping through all of the cells in each row
						nums[i][j] = number++; // assigning the number to that cell and then increasing the number by 1
					}
				}
				
				for (int i = 0; i < nums.length; i++) { // looping through each row
					for (int j = 0; j < nums[i].length; j++) { // looping through all of the cells of each row
						System.out.print(nums[i][j] + "\t"); // printing the value of that cell on the same line and adding space after each
					}
					System.out.println(); // going to the next line after each row is done
				}
		
		
		
		
		
		
		
		
		
	}

}
