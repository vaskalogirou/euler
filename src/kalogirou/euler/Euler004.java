package kalogirou.euler;

import kalogirou.euler.utilities.Utilities;

public class Euler004 {
	public static void main(String[] args) {
		long prod = 1;
		int latestMin = Integer.MAX_VALUE;
		int start = 999;
		for (int big = start; big > 0; big--) {
			for (int small = big; small > 0; small--) {
				long tempProd = big * small;
				if (Utilities.isPalindrome(tempProd)) {
					if (tempProd > prod) {
						prod = tempProd;
					}
					latestMin = small;
					if (big <= latestMin) {
						System.out.println(prod);
						return;
					}
					break;
				}
			}
		}
	}
}
