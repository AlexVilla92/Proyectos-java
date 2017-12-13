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

	static void cargarBolillero(String line, Bolillero bol) {
		String [] res = line.split(",");
		int numberBombo = Integer.parseInt(res[0]);
		int numberConf = Integer.parseInt(res[2]);
		int ranking = Integer.parseInt(res[3]);
		//System.out.println(numberBombo + " " + res[1] + " " + numberConf + " " + ranking);
		Seleccion pais = new Seleccion(numberBombo, res[1], numberConf, ranking);

		bol.cargarBombo(pais);
	}

	public static void main(String[] args) {
		Bolillero bol = new Bolillero();
		try {
			List<String> list = readFile();
			for (String line: list) {
				cargarBolillero(line, bol);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}	

		bol.getSizeBombos();

	}
}