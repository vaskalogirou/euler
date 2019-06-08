package kalogirou.euler.utilities;

public class Utilities {

	public static boolean isPalindrome(long lon) {
		return isPalindrome(String.valueOf(lon));
	}

	public static boolean isPalindrome(String text) {
		String clean = text.replaceAll("\\s+", "").toLowerCase();
		int length = clean.length();
		int forward = 0;
		int backward = length - 1;
		while (backward > forward) {
			char forwardChar = clean.charAt(forward++);
			char backwardChar = clean.charAt(backward--);
			if (forwardChar != backwardChar)
				return false;
		}
		return true;
	}
}
