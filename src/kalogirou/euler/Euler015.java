package kalogirou.euler;

import kalogirou.euler.utilities.Printer;

public class Euler015 {
	public static void main(String[] args) {
		int n = 20;
		long[][] grid = getGrid(n);
		initialize(grid);
		int flag = 1;
		while (flag == 1) {
			flag = traverse(grid);
		}
		Printer.print(grid);
	}

	private static long[][] getGrid(int n) {
		long[][] grid = new long[n + 1][];
		for (int i = 0; i < grid.length; i++) {
			long[] array = new long[grid.length];
			grid[i] = array;
		}
		return grid;
	}

	private static void initialize(long[][] grid) {
		int n = grid.length - 1;
		grid[n][n] = -1;
		for (int i = 0; i < n; i++) {
			grid[i][n] = 1;
			grid[n][i] = 1;
		}
	}

	private static int traverse(long[][] grid) {
		int limit = grid.length - 1;
		for (int i = 0; i < limit; i++) {
			for (int j = 0; j < limit; j++) {
				if (grid[i][j] != 0) {
					continue;
				}
				long rightValue = grid[i][j + 1];
				long downValue = grid[i + 1][j];
				if (rightValue != 0 && downValue != 0) {
					grid[i][j] = rightValue + downValue;
					return 1;
				}
			}
		}
		return -1;
	}
}
