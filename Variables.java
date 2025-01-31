package assignment;

//Assignment 12: WAP to show the usage of variables:local, global, final

public class Variables {

	final static int a = 34;

	float b = 5.67f;

	protected static void mul() {

		int c = 54;
		float mul;

		Variables v = new Variables();

		mul = a * v.b * c;
		System.out.println(mul);

	}

	public static void main(String[] args) {

		mul();
	}

}
