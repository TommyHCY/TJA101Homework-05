package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class LottoNum {

	public static void main(String[] args) {
		int[] lottoNum = new int[49];
		int[] saveNum = new int[49];
		int[] choNum = new int[6];
		int count = 0;
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = i + 1;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字?");
		int hateNum = sc.nextInt();

		for (int i = 0; i < lottoNum.length; i++) {
			if (lottoNum[i] % 10 == hateNum || lottoNum[i] / 10 == hateNum) {
				continue;
			} else {
				count++;
				saveNum[i] = i + 1;
			}
		}
		Arrays.sort(saveNum);
		count = 0;
		for (int i = 0; i < saveNum.length; i++) {
			if (saveNum[i] != 0) {
				break;
			}
			count++;
		}
		saveNum = Arrays.copyOfRange(saveNum, count, 49);
		count = 0;
		for (int i = 0; i < saveNum.length; i++) {
			count++;
			if (count % 6 == 0) {
				System.out.print(saveNum[i] + "\t");
				System.out.println();
			} else {
				System.out.print(saveNum[i] + "\t");
			}
		}
		System.out.print("總共有" + saveNum.length + "數字可選");
		System.out.println("\n"+"=================================");
		int[] ranIndex = new int[6];
//		System.out.println(ranIndex.length);

		for (int i = 0; i < ranIndex.length; i++) {
			ranIndex[i] = (int) (Math.random() * saveNum.length) + 1;
		}

		while (true) {
			//  作ranIdex判斷是否有重複
			for (int i = 0; i < ranIndex.length; i++) {
				for (int j = 0; j < i; j++) {
					if (ranIndex[i] == ranIndex[j]) {
						ranIndex[i] = (int) (Math.random() * saveNum.length) + 1;
						continue;
					} else {
						break;
					}

				}
			}
			break;
		}
		for (int i = 0; i < ranIndex.length; i++) {
			System.out.print(saveNum[ranIndex[i]] + "\t");
		}

	}
}
