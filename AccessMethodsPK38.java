package assignment;
import basicprograms.Addition;
public class AccessMethodsPK38 extends Addition {
	
	static void mulltiplication() { // default method within the package
		double a = 10.89800, b = 20.5577;
		double c = a * b;
		System.out.println(c);
	}

	private static void devide() { // private method within the same class
		float f = 12.12f;
		float d = 60.55f;
		float c = d / f;
		System.out.println(c);
	}

	public static void main(String[] args) {
		sub();					// sub and add method called from basicprograms package
		add();
		mulltiplication();
		devide();
	}

}
