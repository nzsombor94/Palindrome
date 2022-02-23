package palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		if (isPalindrome(input)) {
			System.out.println("A megadott szó palindrom.");
		} else 
			System.out.println(reverseInput(input));
	}

	public static boolean isPalindrome(String input) {
	String myWord = input;
		
		int i = 0;
		int j = myWord.length() - 1;
		
		while (i < j) {
			if (myWord.charAt(i) != myWord.charAt(j))
				return false;
			
			i++;
			j--;
		}
		return true;
	}
	
public static String reverseInput(String input) {
	
		String myWord = input;
		String newString = " ";
		char letter;
		
		for (int i = 0; i < myWord.length(); i++) {
			letter = myWord.charAt(i);
			newString = letter + newString;
		}
		return newString;
	}
}
