package Test;

public class ForLoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 0 -10
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		//10-0
		for(int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		
		// 
		System.out.println("---------------");
		for(int i = 1; i <= 17; i+=2) {
			System.out.println(i + " " + "This is odd");
		}
		
		
		//Check i and see if this is odd or even
		System.out.println("-----------------");
		for(int i = 0; i <= 100; i++) {
			if(i%2 ==0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + "is odd");
			}
		}
		

	}

}
