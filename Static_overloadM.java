package assignment;

//Assignment 8: WAP on static methods overloding

public class Static_overloadM {
	
	static void box(int l,int b, int h) {
		int area;
		
		area=l*b*h;
		
		System.out.println("Area of a box: " +area);
	}
	static void box(long l,float b, int h) {
		float area;
		
		area=l*b*h;
		
		System.out.println("Area of a box: " +area);
	}

	public static void main(String[] args) {
		
		box(10,30,50);
		box(22,3.5f,50);

	}

}
