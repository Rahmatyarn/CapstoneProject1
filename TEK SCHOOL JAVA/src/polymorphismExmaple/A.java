package polymorphismExmaple;

public class A {

	private String name;
	private int age;
	
	// static polymorphism - method overloading
	
	public A() {
		super();
		this.name = "";
		this.age = 0;
	}
	
	public A(String name) {
		this();
		this.name = name;
		
	}
	
	
}
