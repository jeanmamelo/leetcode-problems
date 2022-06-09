package algorithm.palindrome.java;

import java.util.Objects;

public class Palindrome {
	public static boolean isPalindrome(int x) {
		final String number = String.valueOf(x);

		for(int i=0; i < number.length(); i++) {
			if(!Objects.equals(number.charAt(i), number.charAt(number.length() - 1 - i))) {
				return false;
			}
		}
		return true;
	}
}