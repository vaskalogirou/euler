package kalogirou.euler;

import kalogirou.euler.utilities.Fibonacci;

//https://projecteuler.net/problem=1
public class Euler002 {
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		fib.loadUntilValueReachesThreshold(4000000L);
		System.out.println(fib.addEvens());
	}
}
