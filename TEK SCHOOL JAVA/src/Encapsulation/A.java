package Encapsulation;

public class A extends Object {

	String name;
	private int age;
	private int id;

	public A() {
		this.name = "";
		this.age = 0;
		this.id = 0;

	}

	public A(String name, int age, int id) {

		this.name = name;
		this.age = age;
		this.id = id;

	}

	public String getName() {

		return name;

	}

	public void setName(String Name) {

		this.name = name;

	}

	public int getAge() {
		return age;

	}

	public int setAge() {
		return age;

	}

	public int getid() {
		return id;

	}

	public int setid() {

		return id;

	}

}
