package assignment;

// Assignment 7:WAP on method overloading  to perform
//the addition function of different data types.

// Assignment 9:WAP on method overloading non-static

public class NonStatic_Overload {

	public void add(int i, int j) {

		System.out.println(i + j);
	}

	public void add(int i, long j) {

		System.out.println(i + j);
	}
	public void add(String i, int j) {
		
		String s=i +j;
		System.out.println(s);
	}

	public static void main(String[] args) {

		NonStatic_Overload obj = new NonStatic_Overload();
		obj.add(5, 2);
		obj.add(4, 6323);
		obj.add("Hello", 6);
	}

}
