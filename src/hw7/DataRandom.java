package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DataRandom {

	public static void main(String[] args) {
//		System.out.println(num);
//		int count = 0;

		try {
			FileWriter fw = new FileWriter("C:\\TJA101_Workspace\\Homework-05\\src\\hw7\\Data.txt");

			BufferedWriter bw = new BufferedWriter(fw);

			PrintWriter pw = new PrintWriter(bw);

			for (int i = 0; i < 10; i++) {
				int num = (int) (Math.random() * 1000) + 1;
				String c = Integer.toString(num);
//				System.out.println(c);
				pw.append(c + "\t");

			}
			pw.close();
			bw.close();
			fw.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
