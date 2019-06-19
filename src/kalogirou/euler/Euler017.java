package kalogirou.euler;

import java.util.ArrayList;
import java.util.List;

public class Euler017 {
	public static void main(String[] args) {
		System.out.println(oneToNine());
		System.out.println(oneTo999() + "onethousand".length());
	}

	private static int oneTo999() {
		int sum = 0;
		sum += oneToNinetyNine();
		for (String str : hundreds()) {
			sum += 100 * str.length() + oneToNinetyNine() - 3;
		}
		return sum;
	}

	private static int oneToNinetyNine() {
		int sum = 0;
		sum += oneToNine();
		sum += tenToNineteen();
		for (String str : twentyToNinety()) {
			sum += 10 * str.length() + oneToNine();
		}
		return sum;
	}

	private static int oneToNine() {
		String nums = "onetwothreefourfivesixseveneightnine";
		return nums.length();
	}

	private static int tenToNineteen() {
		String nums = "teneleventwelvethirteenfourteenfifteensixteenseventeeneighteennineteen";
		return nums.length();
	}

	private static List<String> twentyToNinety() {
		List<String> lista = new ArrayList<String>();
		lista.add("twenty");
		lista.add("thirty");
		lista.add("forty");
		lista.add("fifty");
		lista.add("sixty");
		lista.add("seventy");
		lista.add("eighty");
		lista.add("ninety");
		return lista;
	}

	private static List<String> hundreds() {
		List<String> lista = new ArrayList<String>();
		lista.add("onehundredand");
		lista.add("twohundredand");
		lista.add("threehundredand");
		lista.add("fourhundredand");
		lista.add("fivehundredand");
		lista.add("sixhundredand");
		lista.add("sevenhundredand");
		lista.add("eighthundredand");
		lista.add("ninehundredand");
		return lista;
	}
}
