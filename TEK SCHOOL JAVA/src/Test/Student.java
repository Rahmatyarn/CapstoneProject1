package Test;

public class Student {

	String name;
	int age;
	int id;
	char gender;

	public Student() {
		name = "";
		age = 0; 
		id = 0;
		gender = ' ';
		
		System.out.println("an object was created");
		
	}
		
	public Student(String newName, int newAge, int newId, char newGender) {
			name = newName;
			age = newAge;
			id = newId;
			gender = newGender;
			
			
	}
	
	public Student(String newName) {
		name = newName;
		age = 0;
		id = 0;
		gender = ' ';
	}
	
	public void printinfo () {
		System.out.println("Name  " +  name + "Age  " + age + "id  " + id + "Gender  " + gender);
	}
		
		
		
		
	}

