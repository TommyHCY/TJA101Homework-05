package hw4;

import java.util.Scanner;

public class YearMonthDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ymd = new int[3];
		System.out.println("今天是幾年?(yyyy)");
		ymd[0] = sc.nextInt();
		System.out.println("今天是幾月?(mm)");
		ymd[1] = sc.nextInt();
		System.out.println("今天是幾日?(dd)");
		ymd[2] = sc.nextInt();

		check: while (true) {
			if (leapYear(ymd[0])) {
				if (ymd[1] >= 1 && ymd[1] <= 12) {
					if ((ymd[1] == 1 || ymd[1] == 3 || ymd[1] == 5 || ymd[1] == 7 || ymd[1] == 8 || ymd[1] == 10
							|| ymd[1] == 12) && ymd[2] == 31) {
						break;
					} else if ((ymd[1] == 4 || ymd[1] == 6 || ymd[1] == 9 || ymd[1] == 11) && ymd[2] == 30) {
						break;
					} else if (ymd[1] == 2 && ymd[2] <= 29) {
						break;
					} else {
						System.out.println("輸入錯誤，今天是幾日?(dd)");
						ymd[2] = sc.nextInt();
						continue check;
					}
				} else {
					System.out.println("輸入錯誤，今天是幾月?(mm)");
					ymd[1] = sc.nextInt();
					continue check;
				}
			} else {
				if (ymd[1] >= 1 && ymd[1] <= 12) {
					if ((ymd[1] == 1 || ymd[1] == 3 || ymd[1] == 5 || ymd[1] == 7 || ymd[1] == 8 || ymd[1] == 10
							|| ymd[1] == 12) && ymd[2] == 31) {
						break;
					} else if ((ymd[1] == 4 || ymd[1] == 6 || ymd[1] == 9 || ymd[1] == 11) && ymd[2] == 30) {
						break;
					} else if (ymd[1] == 2 && ymd[2] <= 28) {
						break;
					} else {
						System.out.println("輸入錯誤，今天是幾日?(dd)");
						ymd[2] = sc.nextInt();
						continue check;
					}
				} else {
					System.out.println("輸入錯誤，今天是幾月?(mm)");
					ymd[1] = sc.nextInt();
					continue check;
				}
			}
		}

		printDays(ymd);

	}

	public static void printDays(int[] yearMonDay) {
		int days = 0;
		if (leapYear(yearMonDay[0])) {
			for (int i = yearMonDay[1]; i > 0;) {
				for (int j = yearMonDay[2]; j > 0; j--) {
					days++;
				}
				i--;
				if (i == 4 || i == 6 || i == 9 || i == 11) {
					yearMonDay[2] = 30;
				} else if (i == 2) {
					yearMonDay[2] = 29;
				} else {
					yearMonDay[2] = 31;
				}
			}
		} else {
			for (int i = yearMonDay[1]; i > 0;) {
				for (int j = yearMonDay[2]; j > 0; j--) {
					days++;
				}
				i--;
				if (i == 4 || i == 6 || i == 9 || i == 11) {
					yearMonDay[2] = 30;
				} else if (i == 2) {
					yearMonDay[2] = 28;
				} else {
					yearMonDay[2] = 31;
				}
			}
		}
		System.out.println("輸入的日期為該年第 " + days + " 天");
	}

	public static boolean leapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

}
