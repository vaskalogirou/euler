package kalogirou.euler;

import java.io.IOException;

import kalogirou.euler.utilities.IOUtils;

public class Euler007 {
	public static void main(String[] args) throws IOException {
		String content = IOUtils.readFile("C:\\Users\\Alki\\Dropbox\\projects\\java\\Euler\\EulerUtilities\\primes.txt");
		String[] tokens = content.split(",");
		System.out.println(tokens.length);
		System.out.println(tokens[5]);
		System.out.println(tokens[10000]);
	}
}
