package assignment;

import java.util.Scanner;

public class ExceptionExam {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter ant number");
			try{
				int a=12;
				int num=sc.nextInt();
				System.out.println(a/num);
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

}
