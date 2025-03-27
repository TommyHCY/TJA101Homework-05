package hw3;

import java.util.Scanner;

public class LottoNum {

	public static void main(String[] args) {
		int[] lottoNum = new int[49];
		int count = 0;
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = i + 1;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字?");
		int hateNum = sc.nextInt();
		
		
	}
}