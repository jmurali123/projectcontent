package coreJava;

public class Car {
	//Instance variables
	private String make;
	private String model;
	private int year;
	private static int  numberOfCars;
	
	//constructor
	public Car(String make,String model,int year) {
	this.make=make;
	this.model=model;
	this.year=year;
	numberOfCars ++;
	}
	
	//static method
	public static int getNumberOfCars() {
		return numberOfCars;
	}
	
	//instance method
	public void startEngine() {
		String message="Starting the engine of make and model" +make+ "and" +model+"  ";
		System.out.println(message);
		
	}
	
	//local method
	public void accelerate() {
		int speed=60; //Local variable
		System.out.println("Accelerating to" +speed+"mph.");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1= new Car("Toyata","Hatchpackmodel",2022);
		Car car2= new Car("Honda","Civic",2023);
		
		System.out.println("Total number of cars:" +Car.getNumberOfCars());
		
		//Accessing instance variables and methods
		car1.startEngine();
		car2.startEngine();
		car1.accelerate();
		car2.accelerate();

	}

}
