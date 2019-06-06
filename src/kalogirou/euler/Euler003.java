package kalogirou.euler;

import kalogirou.euler.utilities.Primes;
import kalogirou.euler.utilities.Printer;

public class Euler003 {
	public static void main(String[] args) {
		Long start = System.currentTimeMillis();
		long number = 600851475143L;// 13195L;
		Primes primes = new Primes();
		primes.load(number);
		Printer.print(primes.getPrimeFactors(number));
		Long end = System.currentTimeMillis();
		System.out.println("all done in " + (end - start) + " milliseconds");
	}
}
