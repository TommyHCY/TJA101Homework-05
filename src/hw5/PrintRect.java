package hw5;

import java.util.Scanner;

public class PrintRect {

	public void starSquare(int weight, int height) {
		System.out.println("請輸入寬與高: ");
		Scanner sc = new Scanner(System.in);
		int weights = sc.nextInt();
		int heights = sc.nextInt();
		for (int i = 0; i < heights; i++) {

			for (int j = 0; j < weights; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
