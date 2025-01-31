package assignment;

// Assignment16: Single-level inheritance

//parent class
class Parent {				

	static void box(int l, int b, int h) {

		int area = l * b * h;

		System.out.println("Area of a box: " + area);
	}
}

//child class
public class SingleInheritance extends Parent { 	

	public static void main(String[] args) {

		Parent.box(12, 34, 20);

	}

}
