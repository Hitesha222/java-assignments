package assignment;

import java.util.Scanner;

//Assignment 11: WAP for scanner class by taking user inputs of student data 

public class ScannerAssi {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

	
			System.out.println("Enter Student id");
			int id = s.nextInt();
			System.out.println("Enter Student name:");
			String sname = s.next();
			System.out.println("Enter Student college name:");
			String cname = s.next();
			System.out.println("Enter phone number:");
			long ph = s.nextLong();

			// print all values which have been entered by user
			System.out.println("------Student Details------\n");
			System.out.println("Student Id is:" + id);
			System.out.println("Student name is:" + sname);
			System.out.println("Student college is:" + cname);
			System.out.println("Phone number is:" + ph);

		
	}

}
