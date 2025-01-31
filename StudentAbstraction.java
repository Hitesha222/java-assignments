package assignment;

//Assignment23:WAP to demonstrate 'Abtraction'using abstract class 'Student'
//which consists of 2 abstract methods and 2 concrete methods
abstract class StudentInfo1 {
	abstract void stud_info(); // abstract method

	abstract void stud_course_info(); // abstract method

	public void stud_logInI() { // concrete method
		String username = "Ganesha123";
		String password = "********";

		System.out.println("Username is:" + username);
		System.out.println("password is:" + password);
	}

	public void stud_logOutI() { // concrete method
		boolean logout = false;

		if (logout == true) {

			System.out.println("User logged out");
		} else {
			System.out.println("User logged out");

		}

	}
}

class Details extends StudentInfo1 {
	@Override
	public void stud_logInI() {
		String username = "Hamza123";
		String password = "********";

		System.out.println("Username is:" + username);
		System.out.println("password is:" + password);
	}

	void stud_course_info() {
		System.out.println("main course is phython");

	}

	void stud_info() {
		System.out.println("Student information in this section");

	}
}

public class StudentAbstraction extends Details {

	public static void main(String[] args) {
		// object creaction for non-static methods
		Details d = new Details();
		d.stud_logInI();
		d.stud_course_info();

	}

}
