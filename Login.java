package assignment;

//Assignment21: Write a program that demonstrate 'Methodoverriding' for 'login'functionality. 
// Where as the three subclasses are: Admin,Teacher,Student. user is superclass 
//Assignment22: Use 'Super' Keyword in the previous methodoverriding program
class User {

	public void login(String username, String password) {
		System.out.println("User login");
	}
}

class Admin extends User {
	// Override login method for admin subclass
	public void login(String username, String password) {
		super.login(username, password);
		if (username.equals("admin") && password.equals("admin123")) {
			System.out.println("Admin logged in successfully!");
		} else {
			System.out.println("Invalid Admin credentials.");
		}
	}
}

class Tutor extends User {
	// Override login method for teacher subclass
	public void login(String username, String password) {
		super.login(username, password);
		if (username.equals("teacher") && password.equals("teacher123")) {
			System.out.println("Teacher logged in successfully!");
		} else {
			System.out.println("Invalid Teacher credentials.");
		}
	}
}

class Student extends User {
	// Override login method for student subclass
	public void login(String username, String password) {
		super.login(username, password);
		if (username.equals("student") && password.equals("student123")) {
			System.out.println("Student logged in successfully!");
		} else {
			System.out.println("Invalid Student credentials.");
		}
	}
}

public class Login {

	public static void main(String[] args) {

		Admin admin = new Admin();
		Tutor teach = new Tutor();
		Student std = new Student();

		admin.login("admin", "admin123");
		teach.login("teacher", "teacher123");
		std.login("student", "student123");

	}

}
