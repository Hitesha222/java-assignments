package assignment;

// assignment-2 one class with 5 methods: 3-static, 2 non-static
// has to be called from main method

public class Methods_Example {

	public static void add() {
		int a = 10, b = 20;
		int c;
		c = a + b;

		System.out.println("Addition: "+c);

	}

	public static void sub() {
		int f = 10, d = 60;

		int c = d - f;

		System.out.println("Subtraction: " +c);

	}
	
	static void box() {
		int area, l=10, b=23, h=43;
		
		area=l*b*h;
		
		System.out.println("Area of a box: " +area);
	}

	private void mul() {
		int f = 10, d = 60;

		int c = d * f;

		System.out.println("Multiplication: " +c);

	}
	
	private void div() {
		int f = 10, d = 60;

		int c = d / f;

		System.out.println("Division:" +c);

	}

	public static void main(String[] args) {

		add();
		sub();
		box();
		
		Methods_Example m1=new Methods_Example();
		m1.mul();
		m1.div();
		

	}

}
