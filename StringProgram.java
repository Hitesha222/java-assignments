package assignment;
//Assignment25: String methods with given string "I love MySelf" 
//Assignment 33
public class StringProgram {

	public static void main(String[] args) {
//		Assignment 35
//		i)Write a program to split the string "Java is fun" into individual words.
		String d = "Java is fun";
		String[] myArray = d.split(" ");
		System.out.println("-------a------");
		for (String myArray1 : myArray) {
			System.out.println(myArray1);
		}

//		ii)Split the string "Java Python C++" using a comma.
		String myArray2 = "Java Python C++";
		String myArray3 = myArray2.replace(" ", ",\n");
			System.out.println("-------b-------");
			System.out.println(myArray3);
		
//		iii)Split the string "Java is fun to learn" into at most 3 parts.
			 String str = "Java is fun to learn";
		        
		        // Split the string into at most 3 parts
		        String[] parts = str.split(" ", 3);
		        
		        // Print the resulting array
		        System.out.println("-------c------");
		        System.out.println("String in 3 most parts:");
		        for (String part : parts) {
		        	System.out.println(part);
		        }
//		iv)Write a program to split a sentence into words, count the words, and print them
			String d1 = "Java is fun to learn";
			String[] myArray4 = d1.split(" ");
			System.out.println("-------d------");
			//splited words
			for (String myArray5 : myArray4) {
				System.out.println(myArray5);
			}
			//total words
			int count=myArray4.length;
			System.out.println("Total words are "+count +" in the given string.");
			
		
			
//		String s = "I love MySelf";
//		String reverse = "";
//
//		System.out.println("Length of the string:" + s.length()); // a-length of string
//		System.out.println("Lowecase string: " + s.toLowerCase()); // b-lowercase
//		System.out.println("uppercase string: " + s.toUpperCase()); // b-uppercase
//		System.out.println("Removed white space: " + s.trim()); // c-remove white spaces
//		System.out.printf("%n");
//		System.out.println("-----Reverse string------");
//
//		// reverse string using for loop
//		for (int i = s.length() - 1; i > 0; i--) {
//			char c1 = s.charAt(i);
//			reverse = reverse + c1;
//			System.out.println(reverse);
//		}
	}

}

/*
 * String input= "Hello! 123Bye 789 ";  // i) Replace all numeric
 * characters in a given string with an empty string ("")
 * System.out.println(input.replaceAll("[0-9]"," ")); // ii)Replace all capital
 * letters in a given string with an empty string ("").
 * System.out.println(input.replaceAll("[A-Z]"," ")); // iii)Replace all lower
 * letters in a given string with an empty string ("").
 * System.out.println(input.replaceAll("[a-z]"," ")); // iv)Replace the letter
 * 'e' with 'y' System.out.println(input.replaceAll("e","y"));
 */