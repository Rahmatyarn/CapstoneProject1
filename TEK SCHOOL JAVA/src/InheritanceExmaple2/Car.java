package InheritanceExmaple2;

public class Car {
	
	private String color;
	private String model;
	private String make;
	private int year;
	private int numberOfDoors;
	private double price;
	private String vinNumber;
	
	
	// default constructor
	
	public Car() {
		super();
		this.color ="";
		this.model = "";
		this.make = "";
		this.year = 0;
		this.numberOfDoors = 0;
		this.price = 0;
		this.vinNumber = "";
		
			}
	// Parameterized constructor
	
	public Car(String vinNumber, String make, String model) {
		
		this();
		this.vinNumber = vinNumber;
		this.make = make;
		this.model = model;
		
	}
	
	// Parameterized constructor 2
	public Car(String color, String model, String make, int year, int numberOfDoors, double price, String vinNumber) {
		this(vinNumber, make, model);
		this.color = color;
		this.year = year;
		this.numberOfDoors = numberOfDoors;
		this.price = price;
		
	}
	
	// getters  - setters
	public String getColor() {
		return color;
	}
	
	public void setcolor() {
		this.color = color;
	}
	
	
	
		
		
		
	}


