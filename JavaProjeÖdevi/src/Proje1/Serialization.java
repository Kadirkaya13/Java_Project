package Proje1;

import java.io.*;

public class Serialization implements Serializable {
	int countOfBike;
	int countOfPencil;
	int countOfTablet;

	public Serialization(int countOfBike, int countOfPencil, int countOfTablet) {
		this.countOfBike = countOfBike;
		this.countOfPencil = countOfPencil;
		this.countOfTablet = countOfTablet;
	}

	public static void printdata(Serialization object1) {
		System.out.println("Serile�mi� Kalem say�s� : " + object1.countOfPencil);
		System.out.println("Serile�mi� tablet say�s� : " + object1.countOfTablet);
		System.out.println("Serile�mi� bisiklet say�s� : " + object1.countOfBike);
	}

	public static void Adet(int countOfPencil, int countOfTablet, int countOfBike) {
		String serialStudentGift = "C:\\Users\\dell\\eclipse-workspace\\JavaProje�devi\\SerializatedFile.txt";
		Serialization serial = new Serialization(countOfBike, countOfPencil, countOfTablet);
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(serialStudentGift);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(serial);
			objectOutputStream.close();
			fileOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fileInputStream = new FileInputStream(serialStudentGift);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Object one = (Serialization) objectInputStream.readObject();
			objectInputStream.close();
			fileInputStream.close();
			printdata(serial);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
