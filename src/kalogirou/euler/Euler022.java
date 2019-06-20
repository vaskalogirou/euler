package kalogirou.euler;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import kalogirou.euler.utilities.IOUtils;

public class Euler022 {
	public static void main(String[] args) throws IOException {
		String str = IOUtils.readFile("resources/p022_names.txt");
		String[] names = str.replace("\"", "").split(",");
		List<String> lista = Arrays.asList(names);
		Collections.sort(lista);
		String[] array = (String[]) lista.toArray();
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total += (i + 1) * getScore(array[i]);
		}
		System.out.println("all done " + total);
	}

	private static int getScore(String name) {
		char[] chars = name.toCharArray();
		int sum = 0;
		for (char c : chars) {
			sum += (int) c - 64;
		}
		return sum;
	}
}
