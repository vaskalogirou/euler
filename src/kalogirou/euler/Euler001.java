package kalogirou.euler;

// https://projecteuler.net/problem=1
public class Euler001 {
	public static void main(String[] args) {
		int sum = 0;
		int max = 1000; //10;
		for (int index = 3; index < max; index++) {
			if (index % 3 == 0 || index % 5 == 0) {
				sum += index;
			}
		}
		System.out.println(sum);
	}
}
