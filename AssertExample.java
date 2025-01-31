package assignment;

// Assignment15:Assert keyword

public class AssertExample {

	int age = 100;

	boolean approveAge() {
		assert (age < 65):"Age entered is:" +age;
		if (age >0) {

			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		AssertExample a = new AssertExample();
		a.approveAge();
	}

}
