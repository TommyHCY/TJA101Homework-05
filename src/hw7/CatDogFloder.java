package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CatDogFloder {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("c:/data/object.ser");
//		File dir = new File("c:/data");
////		file.exists();
//		if (file.exists() == false) {
//			dir.mkdir();
//		} 
//		if (file.exists()) {
//			file.delete();
//		}
////		System.out.println(file.exists());
//		Object cat1 = new Cat("Kerlin");
//		Object cat2 = new Cat("Meth");
//		Object dog1 = new Dog("Welfy");
//		Object dog2 = new Dog("Ben");
//		Object obj[] = new Object[4];
//		obj[0] = cat1;
//		obj[1] = cat2;
//		obj[2] = dog1;
//		obj[3] = dog2;
//		FileOutputStream fos = new FileOutputStream(file);
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		for (int i = 0; i < obj.length; i++)
//			oos.writeObject(obj[i]);
//		oos.close();
//		fos.close();

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(file.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) {
				Object testObj = ois.readObject();
				if (testObj instanceof Cat) {
					Cat testCat = (Cat) testObj;
					testCat.speak();
				}else {
					Dog testDat = (Dog) testObj;
					testDat.speak();
				}
				System.out.println("--------------------");
			}
		} catch (EOFException e) { // end of file
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();

	}

}
