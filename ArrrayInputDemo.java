package assignment;

import java.util.Scanner;

//Assignment 44:Write a Java program to create an array of integers
//it with values entered by the user using scanner class
public class ArrrayInputDemo {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of an array");
			int size = sc.nextInt();
			int[] arr = new int[size];

			System.out.println("Enter numbers only values for an array");
			for (int i = 0; i < size; i++) {
				System.out.print("Enter element " + (i + 1) + ": ");
				arr[i] = sc.nextInt();
			}
			for (int i = 0; i < size; i++) {
				System.out.println("Number "+(i+1) +": "+arr[i]);
				
			}
		}
	}

}
