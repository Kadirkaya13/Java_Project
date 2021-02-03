package Proje1;

import java.io.*;

public class PieceWriter {
	public static void main(String[] args) {
	}

	public static void pWriter() {
		try {
			File myFile = new File("Consoleyazdir.txt");
			FileReader filereader = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(filereader);
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
