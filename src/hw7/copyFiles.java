package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyFiles {
	public static void copyFile(String copyfile, String pastefile) throws IOException {
		File inputFile = new File(copyfile);
		File outputFile = new File(pastefile);

		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		int c;

		while ((c = in.read()) != -1) { 
			out.write(c);
//			System.out.print((char) c);
			System.out.flush();
		}

		in.close();
		out.close();

	}

	public static void main(String[] args) {
		try {
			copyFile("C:\\TJA101_Workspace\\Homework-05\\src\\hw7\\xxx.txt","C:\\TJA101_Workspace\\Homework-05\\src\\hw7\\yyy.txt");
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
