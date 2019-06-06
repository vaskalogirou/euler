package kalogirou.euler.utilities;

import java.util.ArrayList;
import java.util.List;

public class Primes {
	public List<Long> primes = new ArrayList<Long>();

	public void load(long maxNumber) {
		primes.add(2L);
		long limit = (long) Math.sqrt(maxNumber);
		for (long index = 3L; index < limit; index += 2) {
			if (isPrime(index)) {
				primes.add(index);
			}
		}
	}

	public static boolean isPrime(long n) {
		if (n < 2)
			return false;
		if (n == 2 || n == 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		long sqrtN = (long) Math.sqrt(n) + 1;
		for (long i = 6L; i <= sqrtN; i += 6) {
			if (n % (i - 1) == 0 || n % (i + 1) == 0)
				return false;
		}
		return true;
	}

	public List<Long> getPrimeFactors(Long n) {
		List<Long> factors = new ArrayList<Long>();
		for (Long prime : primes) {
			while (n % prime == 0) {
				factors.add(prime);
				n = n / prime;
			}
		}
		return factors;
	}

}
