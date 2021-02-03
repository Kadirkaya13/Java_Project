package Proje1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Tokenler {
	public static void token() {
		try {
			String tok;
			File myFile = new File("C:\\Users\\dell\\eclipse-workspace\\JavaProje÷devi\\OgrenciListesi.txt");
			FileReader fileReader = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;
			while ((line = reader.readLine()) != null) {
				tok = line;
				System.out.println("Line : " + line);
				String[] result = tok.split(" ");
				for (String token : result) {
					System.out.println("Tokenler: " + token);
				}
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
