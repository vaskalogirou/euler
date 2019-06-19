package kalogirou.euler.utilities;

import java.util.List;
import java.util.Map;

public class Printer {
	public static void print(List<?> lista, boolean inline) {
		if (!inline) {
			print(lista);
		} else {
			int size = lista.size();
			for (Object foo : lista) {
				if (inline) {
					System.out.print(foo);
					size--;
					if (size != 0) {
						System.out.print(", ");
					}
				}
			}
		}
	}

	public static void print(List<?> lista) {
		for (Object foo : lista) {
			System.out.println(foo);
		}
	}

	public static void print(Long[] array) {
		for (Long foo : array) {
			System.out.println(foo);
		}
	}

	public static void print(Long[] array, boolean inline) {
		print(array, inline, Math.min(array.length, 20));
	}

	public static void print(Long[] array, boolean inline, int n) {
		if (inline == true) {
			for (Long foo : array) {
				System.out.print(foo);
				n--;
				if (n != 0) {
					System.out.print(", ");
				} else {
					break;
				}
			}
		} else
			print(array);
	}

	public static void print(Byte[] arr) {
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + ", ");
		}
		System.out.println();
	}

	public static void print(Short[][] foo) {
		for (int i = 0; i < foo.length; i++) {
			for (int j = 0; j < foo[i].length; j++) {
				System.out.print(foo[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void print(Map<Integer, int[]> map) {
		for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
			System.out.print(entry.getKey() + " : ");
			print(entry.getValue());
		}
	}

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void print(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void print(long[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
}
