package hw4;

import java.util.Scanner;

public class MoneyBorrow {
	public static void main(String[] args) {
		int[][] empMoney = { { 25, 32, 8, 19, 27 }, { 2500, 800,500, 1000, 1200 } };
		System.out.println("要向同事借多少錢?");
		Scanner sc = new Scanner(System.in);
		int borrowMoney = sc.nextInt();
		int empCount = 0;
		for (int i = 0; i < empMoney[1].length; i++) {
			if (empMoney[1][i] >= borrowMoney) {
				empCount++;
				System.out.print(empMoney[0][i] + "\t");
			}
		}
		System.out.println("總共 " + empCount + " 人");
	}
}
