package kalogirou.euler.utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Primes {
	public List<Long> primes = new ArrayList<Long>();

	public Primes() {
	}

	public Primes(int numberOfPrimes) throws FileNotFoundException, IOException {
		primes = new ArrayList<Long>();
		String content = IOUtils.readFile("primes.txt");
		String[] tokens = content.split(",");
		if (tokens.length < numberOfPrimes) {
			System.out.println("I did not find enough primes in your file");
			return;
		}
		for (int index = 0; index < numberOfPrimes; index++) {
			primes.add(Long.valueOf(tokens[index]));
		}
	}

	public List<Long> getPrimes() {
		return primes;
	}

	public void load(long maxPrime) {
		primes.add(2L);
		long limit = (long) Math.sqrt(maxPrime);
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

	public List<Long> getPrimeFactors(Long number) {
		List<Long> factors = new ArrayList<Long>();
		for (Long prime : primes) {
			if (number < prime) {
				break;
			}
			while (number % prime == 0) {
				factors.add(prime);
				number = number / prime;
			}
		}
		return factors;
	}
}
