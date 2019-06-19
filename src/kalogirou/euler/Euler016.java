package kalogirou.euler;

import java.math.BigInteger;

public class Euler016 {
	public static void main(String[] args) {
		BigInteger num = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		int limit = 1000;
		for (int i = 0; i < limit; i++) {
			num = num.multiply(two);
		}
		String numStr = num.toString();
		char[] chars = numStr.toCharArray();
		int sum = 0;
		for (int i = 0; i < chars.length; i++) {
			int digit = Integer.valueOf(String.valueOf(chars[i]));
			sum += digit;
		}
		System.out.println("all done : " + sum);
	}
}
