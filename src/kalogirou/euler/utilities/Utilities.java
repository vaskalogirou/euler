package kalogirou.euler.utilities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

	public static long getProduct(List<Long> factors) {
		long product = 1L;
		for (Long factor : factors) {
			product *= factor;
		}
		return product;
	}

	public static boolean isSquare(Long number) {
		return (Math.round(Math.sqrt(number)) == Math.sqrt(number));
	}

	public static List<Long> findDivisors(Long number) {
		Set<Long> set = new HashSet();
		Long upperLimit = number;
		for (Long index = 1L; index < upperLimit; index++) {
			if (number % index == 0) {
				set.add(index);
				set.add(number / index);
				upperLimit = number / index;
			}
		}
		return new ArrayList<>(set);
	}
}
