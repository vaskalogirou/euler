package kalogirou.euler;

import kalogirou.euler.utilities.Utilities;

public class Euler009 {
	public static void main(String[] args) {
		int max = 1000;
		int[] squares = new int[max];
		for (int index = 1; index < max; index++) {
			squares[index] = index * index;
		}

		for (int index = 1; index < max; index++) {
			for (int j = index + 1; j < max - 1; j++) {
				long firstSquare = squares[index];
				long secondSquare = squares[j];
				if (Utilities.isSquare(firstSquare + secondSquare)) {
					double firstSide = Math.sqrt(firstSquare);
					double secondSide = Math.sqrt(secondSquare);
					double bigSide = Math.sqrt(firstSquare + secondSquare);
					if (firstSide + secondSide + bigSide == 1000) {
						System.out.println(firstSide * secondSide * bigSide);
						return;
					}
				}
				long c = squares[j + 1];
				if (firstSquare < c - secondSquare) {
					break;
				}
			}
		}
		System.out.println("all done");
	}
}
