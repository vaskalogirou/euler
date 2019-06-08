package kalogirou.euler.utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IOUtils {
	public static String readFile(String path) throws IOException {
		String content = new String(Files.readAllBytes(Paths.get(path)));
		return content;
	}
}
