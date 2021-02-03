package Proje1;

import java.io.*;

public class Writer {
	public static void writer(String konum, String surName, String name, String note) {
		File file = new File(konum);
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			fileWriter.write(surName + "\t");
			fileWriter.write(name + "\t");
			fileWriter.write(note + "\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void countWriter(String konum, int countPencil, int countTablet, int countBike) {
		File file = new File(konum);
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			fileWriter.write("\n");
			fileWriter.write("Kalem = " + countPencil + "\n");
			fileWriter.write("Tablet Bilgisayar = " + countTablet + "\n");
			fileWriter.write("Bisiklet= " + countBike + "\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void ConsoleWriter(String konum, int countPencil, int countTablet, int countBike) {
		File file = new File(konum);
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			fileWriter.write("Kalem = " + countPencil + "\n");
			fileWriter.write("Tablet Bilgisayar = " + countTablet + "\n");
			fileWriter.write("Bisiklet= " + countBike + "\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
