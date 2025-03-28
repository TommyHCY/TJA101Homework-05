package hw3;

import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!!!");
		int gNum;
		int guNum;
		int num = (int) (Math.random() * 9);
		int hNum = (int)(Math.random()*100);
		while (true) {
			gNum = sc.nextInt();
			if (gNum == num) {
				System.out.println("答對了!答案就是 " + num);
				break;
			} else {
				System.out.println("猜錯囉");
			}
		}
		System.out.println("===============================");
		System.out.println("開始猜數字吧!!! 0~100");
		while (true) {
			guNum = sc.nextInt();
			if (guNum == hNum) {
				System.out.println("答對了!答案就是 " + hNum);
				break;
			} else if(guNum > hNum){
				System.out.println("大於正確答案");
			}else {
				System.out.println("小於正確答案");
			}
		}
	}
}
