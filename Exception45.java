package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception45 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter a number");
			int num1 = scanner.nextInt();
			System.out.println("Enter a number again");
			int num2 = scanner.nextInt();
			int num = num1 / num2;
			System.out.println("The answer is " + num);

		} catch (ArithmeticException e) {
			System.out.println(e.getStackTrace());
			System.out.println("Zero as in denomemator could be cause an error.");
		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
			System.out.println("Please enter valid input.");
		}catch(NoSuchMethodError e) {
			System.out.println("This type of method does not exists.");
		}
	}

}
