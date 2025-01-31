package assignment;

//Assignment 6: Create an employee class & demonstrate cunstructor overloading
//Assignment 19: use of this keyword
public class Employee {

	String ecompany; // non-static global variable

	// constructor with no parameters
	Employee() {
		this(203, "Hamish", "wipro");
		System.out.println("this is default constructor.");
	}

	// constructor with parameters
	Employee(int eid, String ename, String ecompany) {

		this.ecompany = ecompany; // Use of this keyword

		System.out.println("Employee id is:" + eid);
		System.out.println("Employee name is:" + ename);
		System.out.println("Employee company is:" + ecompany);
	}

	// constructor with parameters
	Employee(String designation, double salary) {
		System.out.println("Employee id is:" + designation);
		System.out.println("Employee designation is:" + salary);

	}

	public static void main(String[] args) {
		
		new Employee(101, "Josh", "Vitality");
		new Employee("Manager", 80000.00);
		new Employee();

	}

}
