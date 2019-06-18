package kalogirou.euler;

import java.util.HashMap;
import java.util.Map;

public class Euler014 {
	private static Map<Long, Long> map = new HashMap<Long, Long>();

	public static void main(String[] args) {
		map.put(1L, 1L);
		map.put(2L, 2L);
		long max = 0;
		long startingPoint = 0;
		int limit = 1000000;
		for (long index = 2; index < limit; index++) {
			long temp = getDepth(index);
			if (temp > max) {
				startingPoint = index;
				max = temp;
			}
		}
		System.out.println("all done : " + max);
		System.out.println("starting point : " + startingPoint);
	}

	private static long getDepth(long n) {
		if (map.containsKey(n)) {
			return map.get(n);
		}
		long result = 1 + getDepth(collatz(n));
		map.put(n, result);
		return result;
	}

	private static long collatz(long n) {
		if (n % 2 == 0) {
			return n / 2;
		}
		long result = 3 * n + 1;
		if (result < 0) {
			System.out.println("KABOOM");
		}
		return result;
	}
}
