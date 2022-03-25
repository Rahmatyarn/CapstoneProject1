package Test;

public class CastingInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 10.9;
		int y = 5;
		
		System.out.println(x+y);
		
		int z = (int) x / y;
		System.out.println(z);
		
		double x1 = 10 / 3;
		double x2 = 10 / 3.0;
		
		int x3 = 10 / 3;
		double x4 = (int) 10 / 3.0;
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		
		
		
	}

}
