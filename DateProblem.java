package assignment;

import java.util.Date;

//Assignment 36: Write a program for the below scenarios using date class
public class DateProblem {
	public static void main(String[] args) {
		Date date = new Date();
//i)To get Current Time
		Date inputDate = new Date(date.getTime());
		String input = inputDate.toString();
		System.out.println("Current Time: " + inputDate);
//ii)To get future Time
		Date inputDate1 = new Date(date.getTime() + 1000 * 60 * 60 * 24 * 5);
		System.out.println("Future Time: " + inputDate1);
//iii)To get Past Time
		Date inputDate2 = new Date(date.getTime() - 1000 * 60 * 60 * 24 * 5);
		System.out.println("Past Time: " + inputDate2);
// Assignment37: Write a program to display the time in the format : "Wed, Nov 20"
		System.out.println(input.substring(8, 23));
		String day = input.substring(0, 3);
		String month = input.substring(4, 7);
		String dat = input.substring(8, 10);
		System.out.println(day+", "+month+" "+dat);
	}
}
