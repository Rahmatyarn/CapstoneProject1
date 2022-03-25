package Test;

public class Runner {
	
	public static void main(String[] args) {
		
		Student naqib = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		Student st4 = new Student("Evan", 18, 145, 'F');
		Student st5 = new Student("Michael");
		
		st5.age = 14;
		
		System.out.println(st5.age);
		
		System.out.println(st5.name);
		System.out.println("------------------------");
		st4.printinfo();
		//System.out.println(st4.printinfo());
		System.out.println("--------------------------------------------");
		
		System.out.println(st4.name);
		System.out.println(st4.age);
		System.out.println(st4.id);
		System.out.println(st4.gender);
		
		
		
		st3.name ="David";
		System.out.println(st3.name);
		
		
		st2.name = "Jack";
		st2.age = 18;
		st2.id = 123;
		st2.gender = 'F';
		naqib.name = "Yama";
		
		System.out.println(naqib.name);
		System.out.println(st2.name);
		System.out.println(st2.age);
		System.out.println(st2.id);
		System.out.println(st2.gender);
		
		
	}
	

}
