package kalogirou.euler;

public class Euler006 {
	public static void main(String[] args) {
		int number = 100;
		long sumOfSquares = 0;
		for (int index = 0; index <= number; index++) {
			sumOfSquares += index * index;
		}

		int sum = 0;
		for (int index = 1; index <= number; index++) {
			sum += index;
		}
		long squareOfSum = sum * sum;
		System.out.println(squareOfSum - sumOfSquares);
	}
}
