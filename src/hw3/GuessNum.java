package hw3;

import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!!!");
		int GNum;
		int num = (int) (Math.random() * 9);
		while (true) {
			GNum = sc.nextInt();
			if (GNum == num) {
				System.out.println("答對了!答案就是 " + num);
				break;
			} else {
				System.out.println("猜錯囉");
			}
		}
		System.out.println("===============================");
		
	}
}
