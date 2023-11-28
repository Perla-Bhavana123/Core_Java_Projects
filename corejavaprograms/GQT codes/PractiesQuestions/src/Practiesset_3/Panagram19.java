package Practiesset_3;
import java.util.Scanner;

public class Panagram19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input = sc.next(); 
		boolean isPangram = isPangram(input);

		if (isPangram) {
			System.out.println("The given string is a pangram.");
		} else {
			System.out.println("The given string is not a pangram.");
		}
	}

	public static boolean isPangram(String str) {

		str = str.toLowerCase();

		// Create a boolean array to mark the presence of each letter in the alphabet
		boolean[] alphabet = new boolean[26];

		// Iterate through the string and mark each letter as present
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				alphabet[ch - 'a'] = true;
			}
		}

		// Check if all letters are present in the alphabet array
		for (boolean present : alphabet) {
			if (!present) {
				return false;
			}
		}
		return true;
	}
}





