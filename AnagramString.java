package assignment;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// Anagram string
		String s1 = "race";
		String s2 = "care";

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		if(Arrays.equals(c1, c2)) {
			System.out.println("Both are anagram");
			
		}else {
			System.out.println("Both are differrent, not anagram");
		}
	}

}
