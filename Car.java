package assignment;

//Assignment 18: WAP on Super statement calling from child constructor

class Vehicle {

	String type = "car";
	String model = "Ford";
	String color = "Blue";
	int year = 1990;

	Vehicle() {
		System.out.println("This is parent class constructor");
	}

}

public class Car extends Vehicle {

	Car() {
		super(); // super calling statement
		System.out.println("This is child class consructor");
	}

	public static void main(String[] args) {
		System.out.println("This is main method");

		Car c = new Car();
		System.out.println(c);

	}

}
