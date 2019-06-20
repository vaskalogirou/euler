package kalogirou.euler;

import java.math.BigInteger;

public class Euler020 {
	public static void main(String[] args) {
		BigInteger num = new BigInteger("1");
		int limit = 100;
		for (int i = 1; i <= limit; i++) {
			num = num.multiply(new BigInteger(String.valueOf(i)));
		}
		char[] chars = num.toString().toCharArray();
		int sum = 0;
		for (int i = 0; i < chars.length; i++) {
			sum+= Integer.valueOf(String.valueOf(chars[i]));
		}
		System.out.println(sum);
	}
}
