package Test;

public class LoopingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Important Interview Question
		String text = "testing"; //this is our string value
		 
		int i = text.length() -1; //this is when we get the length -1 which will give us the last character
		
		System.out.println(i);
		System.out.println(text.length());
		System.out.println(text.charAt(i));
	
		while(i >= 0) { //run for as long as i >= 0, which is the last index and then reduce i by 1
			System.out.print(text.charAt(i--));
					
		
		}
		
		
	}

}
