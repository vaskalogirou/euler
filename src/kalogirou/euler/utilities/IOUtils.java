package kalogirou.euler.utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IOUtils {
	public static String readFile(String path) throws IOException {
		String content = new String(Files.readAllBytes(Paths.get(path)));
		return content;
	}

	public static int[][] readGrid(String grid) {
		String[] lines = grid.split("\r\n");
		int[][] result = new int[lines.length][];
		for (int index = 0; index < lines.length; index++) {
			String[] tokens = lines[index].trim().split(" ");
			int[] numbers = new int[tokens.length];
			for (int j = 0; j < tokens.length; j++) {
				numbers[j] = Integer.valueOf(tokens[j]);
			}
			result[index] = numbers;
		}
		return result;
	}
}
