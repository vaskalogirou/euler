package kalogirou.euler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import kalogirou.euler.utilities.Utilities;

public class Euler023 {
	public static void main(String[] args) {
		//		int limit = 100; 
		int limit = 28123;
		int counter = 0;
		List<Long> abundants = new ArrayList<Long>();
		for (long index = 2; index <= limit; index++) {
			List<Long> lista = Utilities.findDivisors(index);
			long sum = Utilities.calculateSum(lista);
			if (sum > 2 * index) {
				abundants.add(index);
				counter++;
				System.out.print(".");
				if (counter % 100 == 0) {
					System.out.println();
				}
			}
		}

		long[] array = abundants.stream().mapToLong(l -> l).toArray();
		Set<Long> sums = new HashSet<Long>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				sums.add(array[i] + array[j]);
			}
		}

		long total = 0;
		for (long index = 1; index <= limit; index++) {
			if (!sums.contains(index)) {
				total += index;
			}
		}
		System.out.println("all done : " + total);
	}
}
