package ClassAndObject;

public class Runner {

	public static void main(String[] args) {
		// how to create objects of a class
		// datatype name = value
		// data-type name; <<< declaration
		// name = new data-type(); <<< initialization
		// data-type(Class Name) name = new data-type(Class Name)();

	
	Student st1 = new Student();
	Student st2 = new Student();
	Student st3 = new Student();
	
	st1.name = "Naqib";
	st1.age = 18;
	st1.id = 1;
	st1.gender = 'M';
	
	st2.name = "Omar";
	st2.age = 25;
	st1.id = 2;
	st1.gender = 'M';
	
	st3.name = "Kabir";
	st3.age = 18;
	st3.id = 3000;
	st3.gender = 'M';
	
	System.out.println("Object st1 " + st1.name);
	System.out.println("Object st1 " + st1.age);
	System.out.println("Object st3 " + st3.id);
	System.out.println("Object st3 " + st3.gender);
	
	System.out.println("********************************************");
	
	System.out.println("Object st1 " + st2.name);
	System.out.println("Object st1 " + st2.age);
	System.out.println("Object st3 " + st3.id);
	System.out.println("Object st3 " + st3.gender);
	
	System.out.println("********************************************");
	
	System.out.println("Object st3 " + st3.name);
	System.out.println("Object st3 " + st3.age);
	System.out.println("Object st3 " + st3.id);
	System.out.println("Object st3 " + st3.gender);
	
	Student st4 = new Student("Ana", 19, 4, 'F');
	Student st5 = new Student();
	
	System.out.println("-------------------");
	System.out.println("Object st4 " + st4.name);
	System.out.println("Object st4 " + st4.age);
	System.out.println("Object st4 " + st4.id);
	System.out.println("Object st4 " + st4.gender);
	System.out.println("-------------------");
	System.out.println("Object st5 " + st5.name);
	System.out.println("Object st5 " + st5.age);
	System.out.println("Object st5 " + st5.id);
	System.out.println("Object st5 " + st5.gender);
	
	st4.printInfo();
	
	
	}
}

