package Test;

public class CreatingPatternswithNestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int w = 0; w < 3;)
		
		
		for(int i = 1; i < 6; i++) { //Outer Loop - rows
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 6; i > 0; i--) {
			for (int j=i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
