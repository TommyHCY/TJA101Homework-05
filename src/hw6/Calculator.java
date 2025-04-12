package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	private int x;
	private int y;

	public void powerXY(int x, int y) throws CalException {

		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				try {
					try {
						System.out.println("請輸入x的值: ");
						x = sc.nextInt();
						break;
					} catch (InputMismatchException e) {
						throw new CalException("輸入格式錯誤，");
					}
				} catch (CalException e) {
					sc.nextLine();
					e.printStackTrace();
				}
			}

			while (true) {
				try {
					try {
						System.out.println("請輸入y的值: ");
						y = sc.nextInt();
						break;
					} catch (InputMismatchException e) {
						throw new CalException("輸入格式錯誤，");
					}
				} catch (CalException e) {
					sc.nextLine();
					e.printStackTrace();
				}
			}
			if (x == 0 && y == 0) {
				throw new CalException(x + "的" + y + "次方沒有意義");
			} else if (x < 0 || y < 0) {
				throw new CalException("次方為負值，結果回傳不為整數!");
			} else {
				System.out.println(x + "的" + y + "次方等於" + (int) Math.pow(x, y));
			}
		} catch (CalException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
