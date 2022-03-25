package Test;

public class ArrysNawin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[] = new int[4];
		
		i [0] = 10;
		i [1] = 20;
		i [2] = 30;
		i [3] = 40;
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		// System.out.println(i[4]); why we cannot print 4 when we have 4 ints. ArrayIndexOutOfBoundsException
		
		System.out.println(i.length);
		//print all the values of array: use for loop
		for(int j=0; j<i.length; j++) {
			System.out.println();
			
		//. Double Array;
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 45.55;
		
		System.out.println(d[0]);
		
		System.out.println("**********************");
		
		//3. char array:
		char p[] = new char[3];
		p[0] = 'a';
		p[1] = 'b';
		p[2] = '$';
		
		System.out.println(p[1]);
		
		System.out.println("*************************");
		boolean b[]	= new boolean[2];
		b[0] = true;
		b[1] = false;
		
		System.out.println(b[1]);
		
		System.out.println("----------------------------");
			
		// 5. String Array
		
		String s[] = new String[3];
		
		s[0] = "Naqib";
		s[1] = "Omar";
		s[2] = "Kabir";
		
		System.out.println(s[2]);
		System.out.println(s.length);
			
		//6. Object Array: (Object is a class) -- Object array is used to store different data types values
		
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1990";
		ob[4] = 'M';
		ob[5] = "London";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
		
		
		for(int ob1=0; ob1<=6; ob1++) {
			System.out.println(ob1);
		}
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}

}
