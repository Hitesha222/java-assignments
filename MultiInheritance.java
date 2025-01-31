package assignment;
//Assignment17: WAP on multi level inheritance-3 static,2 non ststic methods

//parent class
class VehicleInfo1 {

	public void car(String brand_type) { // non-static method

		String brand = brand_type;

		System.out.println(brand);

	}

	public static void car(String model_type, int model_year) { // static method

		String model = model_type;
		int year = model_year;

		System.out.println("Ford car model is: " + model);
		System.out.println("Year: " + year);

	}

	public static void car(String engine_type, String transmission) { // static method

		String engine = engine_type;
		String trans = transmission;

		System.out.println("Engine type is: " + engine);
		System.out.println("Transmission: " + trans);

	}

}

//child class-one
class VehicleInfo2 extends VehicleInfo1 {

	public void car(String color) { // non-static method
		String colour = color;

		System.out.println("car colour is: " + colour);

	}

	public static void car(String bodyStyle, double price) { // static method
		String body_Style = bodyStyle;
		Double value = price;

		System.out.println("Car body style is: " + body_Style);
		System.out.println("Price is:" + value);

	}
}

//child class-two
public class MultiInheritance extends VehicleInfo2 {

	// main method
	public static void main(String[] args) {

		System.out.println("\nS------Ford car details---------\n");

		// object declaration and initialization
		VehicleInfo2 v = new VehicleInfo2();
		v.car("White");
		VehicleInfo1.car("Kuga ST", 2020);
		VehicleInfo2.car("5 door", 35640.00);

	}

}
