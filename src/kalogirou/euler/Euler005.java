package kalogirou.euler;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import kalogirou.euler.utilities.Primes;
import kalogirou.euler.utilities.Utilities;

public class Euler005 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Primes primes = new Primes(15);
		List<Long> factors = new ArrayList<Long>();
		for (long index = 2; index <= 20; index++) {
			List<Long> tempFactors = primes.getPrimeFactors(index);
			Long product = Utilities.getProduct(factors);
			for (Long tempFactor : tempFactors) {
				if (product % index != 0) {
					factors.add(tempFactor);
					product = Utilities.getProduct(factors);
				}
			}
		}
		System.out.println(Utilities.getProduct(factors));
	}
}
