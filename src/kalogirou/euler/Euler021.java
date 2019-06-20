package kalogirou.euler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kalogirou.euler.utilities.Utilities;

public class Euler021 {
	public static void main(String[] args) {
		long result = 0;
		Map<Long, Long> map = new HashMap<Long, Long>();
		for (long i = 2; i <= 10000; i++) {
			List<Long> lista = Utilities.findDivisors(i);
			long sum = sum(lista) - i;
			map.put(i, sum);
		}
		for (Map.Entry<Long, Long> entry : map.entrySet()) {
			Long key = entry.getKey();
			Long value = entry.getValue();
			if (!key.equals(value) && map.containsKey(value) && map.get(value).equals(key)) {
				result += key + value;
				System.out.println(key + " " + value);
			}
		}
		System.out.println("all done : " + result / 2);
	}

	private static long sum(List<Long> lista) {
		long sum = 0;
		for (Long num : lista) {
			sum += num;

		}
		return sum;
	}
}
