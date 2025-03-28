package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Trangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] side = new int[3];
		System.out.println("請輸入3個整數: ");
		for (int i = 0; i < side.length; i++) {
			side[i] = sc.nextInt();

		}
		Arrays.sort(side);
		
		if (side[0] == 0 || side[1] == 0 || side[2] == 0 || (side[0] + side[1]) < side[2]) {
			System.out.println("不是三角形");
		} else if (side[0] == side[1] && side[0] == side[2] ) {
			System.out.println("正三角形");
		} else if (side[0] == side[1] || side[0] == side[2] || side[1] == side[2]) {
			System.out.println("等腰三角形");
		} else if ((side[0] * side[0] + side[1] * side[1]) == side[2] * side[2]) {
			System.out.println("直角三角形");
		} else {
			System.out.println("其他三角形");
		}
//		System.out.println(triSum);
//		for (int i = 0; i < side.length; i++) {
//			System.out.println(side[i]);
//		}

	}

}
