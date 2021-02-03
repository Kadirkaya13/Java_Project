package Proje1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
	public static void read(String konum) {
		File file = new File(konum);
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String gender = reader.next();
				String name = reader.next();
				String surName = reader.next();
				String note = reader.next();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
