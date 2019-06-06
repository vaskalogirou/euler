package kalogirou.euler.utilities;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	public Map<Integer, Long> map;

	public void loadUntilValueReachesThreshold(long threshold) {
		map = new HashMap<Integer, Long>();
		map.put(1, 1L);
		map.put(2, 2L);
		for (int index = 3; index <= Integer.MAX_VALUE; index++) {
			Long nextValue = map.get(index - 1) + map.get(index - 2);
			if (nextValue >= threshold) {
				return;
			}
			map.put(index, nextValue);
		}
	}

	public void print() {
		for (Map.Entry<Integer, Long> entry : map.entrySet()) {
			System.out.print(entry.getValue() + " ");
		}
	}

	public long addEvens() {
		long sum = 0;
		for (Map.Entry<Integer, Long> entry : map.entrySet()) {
			Long value = entry.getValue();
			if (value % 2 == 0) {
				sum += value;
			}
		}
		return sum;
	}
}
