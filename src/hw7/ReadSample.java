package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadSample {
	public static void main(String[] args) {
		// 寫一個程式讀取Sample.txt並輸出以下訊息：
		// Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
		int byteCount = 0;
		int charCount = 0;
		int lineCount = 0;
		System.out.println("xxxzzz");
		try {
			String str;
			File file = new File("C:\\TJA101_Workspace\\Homework-05\\src\\hw7\\Sample.txt");
			byteCount = (int) file.length();
//			System.out.println(file.length());

			FileReader fr = new FileReader("C:\\TJA101_Workspace\\Homework-05\\src\\hw7\\Sample.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((str = br.readLine()) != null) {
				lineCount++;
//				System.out.println(str);
				charCount += str.length();
			}
			br.close();
			fr.close();
			System.out.println("Sample.txt檔案共有" + byteCount + "個位元組，" + charCount + "個字元，" + lineCount + "列資料");
		} catch (Exception e) {
			e.fillInStackTrace();
		}
	}
}
