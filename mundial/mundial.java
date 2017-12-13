import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;

class Mundial {

	static List<String> readFile() throws java.io.IOException {
		List<String> list = new ArrayList<String>();
		File file = new File("teams.txt");
		list = Files.readAllLines(file.toPath(),Charset.defaultCharset());

		if (list.isEmpty()) return null;

		return list;
	}

	public static void main(String[] args) {
		try {
			List<String> list = readFile();
			for (String line: list) {
				System.out.println(line);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}