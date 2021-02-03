package Proje1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentGiftFinder {

	public static void main(String[] args) {
		readFile();
		Tokenler.token();
		PieceWriter.pWriter();
		try {

			FileOutputStream fileOutputStream = new FileOutputStream(
					"C:\\Users\\dell\\eclipse-workspace\\JavaProje÷devi\\OgrenciHediyeler.ser");
			ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
			os.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fileInputStream = new FileInputStream(
					"C:\\Users\\dell\\eclipse-workspace\\JavaProje÷devi\\OgrenciHediyeler.ser");
			ObjectInputStream os = new ObjectInputStream(fileInputStream);
			fileInputStream.close();
			os.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void readFile() {
		int countBisiklet = 0;
		int countTablet = 0;
		int countKalem = 0;
		String route = "C:\\Users\\dell\\eclipse-workspace\\JavaProje÷devi\\OgrenciListesi.txt";
		Reader.read(route);
		File file = new File(route);
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String gender = reader.next();
				String name = reader.next();
				String surName = reader.next();
				String note = reader.next();
				System.out.println("cinsiyet: " + gender + " isim: " + name + " soyad: " + surName + " Durum: " + note);
				if (gender.equals("F") && note.equals("iyi")) {
					note = "Bisiklet";
					countBisiklet++;

				} else if (gender.equals("M") && note.equals("iyi")) {
					note = "Tablet bilgisayar";
					countTablet++;
				} else {
					note = "Kalem";
					countKalem++;
				}

				Writer.writer("C:\\Users\\dell\\eclipse-workspace\\JavaProje÷devi\\OgrenciHediyeler.txt", surName, name,
						note);
				if (!reader.hasNextLine()) {
					Writer.countWriter("C:\\Users\\dell\\eclipse-workspace\\JavaProje÷devi\\OgrenciHediyeler.txt",
							countKalem, countTablet, countBisiklet);
					Serialization.Adet(countKalem, countTablet, countBisiklet);
					Writer.ConsoleWriter("C:\\Users\\dell\\eclipse-workspace\\JavaProje÷devi\\Consoleyazdir.txt",
							countKalem, countTablet, countBisiklet);

				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
