package assignment;

import java.util.Arrays;

//Assignment31: Check two strings are anagram or not
public class Anagrams {

	public static void main(String[] args) {
		String q11 = "listen";
		String q22 = "Silent"; // Listen
		String q21 = q22.toLowerCase();

		char[] q4 = q11.toCharArray();
		char[] q5 = q21.toCharArray();

		Arrays.sort(q4);
		Arrays.sort(q5);

		System.out.println(Arrays.toString(q5));
		System.out.println(Arrays.toString(q4));
		if (Arrays.equals(q4, q5)) {
			System.out.println("both strings are anagrams");
		} else {
			System.out.println("Both strings are not anagrams");
		}
	}
}
		



/*
 * (a) using equals() and equalsIgnoreCase string method
 * System.out.println("-----equals & equalsIgnoreCase methods----");
 * System.out.println(q11.equals(q22));
 * System.out.println(q11.equalsIgnoreCase(q22));
 * 
 * // (b) using contains() string method
 * 
 * String q3="Java programming is awesome!"; String q6="Java"; String
 * q7="Phython";
 * 
 * System.out.println("------------Contains method------------");
 * System.out.println("Is 'Java' part of the string?\n"+q3.contains(q6));
 * System.out.println("Is 'Phython' part of the string?\n"+q3.contains(q7));
 * 
 * (c)String name = "John"; int age = 30; String formatted =
 * String.format("Name: %s, Age: %d", name, age); System.out.println(formatted);
 */
