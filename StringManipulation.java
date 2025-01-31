package assignment;

//Assignment27: String manipulation with the given string-Palindrome, equal,trim
//Assignment30: find no. letters,digits,spaces, special char
public class StringManipulation {

	public static void main(String[] args) {

		String q = " Hello!    123@    jAvA_";

// remove all special characters->System.out.println("Hello "+q.replaceAll("[^a-zA-Z0-9]", ""));
// remove all middle spaces->System.out.println("Hi "+q.replaceAll("\\s", ""));
		int alphabets = 0, numeric = 0, special_char = 0, spaces = 0;

		for (char q1 : q.toCharArray()) {
			if (Character.isLetter(q1)) {
				alphabets++;
			} else if (Character.isDigit(q1)) {
				numeric++;
			} else if (Character.isSpaceChar(q1)) {
				special_char++;
			} else {
				spaces++;
			}
		}
		System.out.println("No. of alphabets are " + alphabets);
		System.out.println("No. of digits are " + numeric);
		System.out.println("No. of special characters are " + special_char);
		System.out.println("No. of spaces are " + spaces);

		// (a)A given string is palindrome
		String dr1 = "rotator";
		String reverse = " ";

		for (int i = dr1.length() - 1; i >= 0; i--) {
			reverse = reverse + dr1.charAt(i);
		}
		System.out.println("------------------------------");
		System.out.println("(a) Palindrome of 'rotator' is: " + reverse);

		// (b)Check two strings are equal
		String e1 = "Java";
		String e2 = "java";
		System.out.println(e1==e2);
		System.out.println("(b) Two strings are equal or not: " + e1.equals(e2));

		// (c)Display the trimmed string from the original string
		String ee1 = " A very good morning ! ";
		System.out.println("(c) String after trimmed is: " + ee1.trim());

	}

}
