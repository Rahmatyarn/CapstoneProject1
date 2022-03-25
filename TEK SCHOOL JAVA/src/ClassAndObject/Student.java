package ClassAndObject;

public class Student {
	
	String name;
	int age;
	int id;
	char gender;
	
	// default constructor - the constructor that does not have any arguments/parameters is called default constructor
	// the job of the constructor is to initialize all of the variables of the class
	// signature - name and args of a method
	// Defination - anything beofre body
	
	public Student() {
		name = "";
		age = 0;
		id = 0;
		gender = ' ';
		
		System.out.println("An Object just got created");
		
	}
	
	// Parameterized Constructors - the constructors that have some arguments
	public Student(String newName, int newAge, int newId, char newGender) {
		name = newName;
		age = newAge;
		id = newId;
		gender = newGender;
	}
		
		
	public Student(String newname) {
		name = newname;
		age = 0;
		id = 0;
		gender =' ';
	}
	
	
	public void printInfo() {
		String g = "";
		if(gender == 'M') {
			g = "Male";
		} else {
			g = "Female";
		}
		System.out.println("Name " + name + ", Age: " + age + ", ID: " + id + ", Gender: " + g);
		
	}
	
	
	
	
}
