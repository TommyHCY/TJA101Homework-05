package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadCatDog {

	public static void main(String[] args) {
		File file = new File("c:/data/object.ser");

		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println(file.getName() + "檔案內容如下: ");
			System.out.println("--------------------");
			try {
				while (true) {
					Object testObj = ois.readObject();
					if (testObj instanceof Cat) {
						Cat testCat = (Cat) testObj;
						testCat.speak();
					} else {
						Dog testDat = (Dog) testObj;
						testDat.speak();
					}
					System.out.println("--------------------");
				}
			} catch (EOFException e) { // end of file
				System.out.println("資料讀取完畢！");
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
