package kalogirou.euler;

import java.util.List;

import kalogirou.euler.utilities.Utilities;

public class Euler012 {
	public static void main(String[] args) {
		Long start = System.currentTimeMillis();
		long triangle = 0;
		int max = 15000;
		for (int index = 1; index < max; index++) {
			triangle += index;
			if (triangle % 2 != 0) {
				continue;
			}
			List<Long> divisors = Utilities.findDivisors(triangle);
			if (divisors.size() > 500) {
				System.out.println(triangle + " more than 500");
			}
			if (index % 50 == 0) {
				System.out.print("*");
			}
		}

		Long end = System.currentTimeMillis();
		System.out.println("all done in " + (end - start) / 1000 + " seconds");
	}
}
