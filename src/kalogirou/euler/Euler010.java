package kalogirou.euler;

import java.io.IOException;

import kalogirou.euler.utilities.Primes;

public class Euler010 {
	public static void main(String[] args) throws IOException {
		Primes primes = new Primes();
		primes.loadAll();
		long sum = 0;
		for (Long prime : primes.getPrimes()) {
			if (prime > 2000000) {
				break;
			}
			sum += prime;
		}
		System.out.println(sum);
	}
}
