package hw2;

public class Lotto {

	public static void main(String[] args) {
		/*
		 * 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字, 不論是個位數或是十位數。 輸出結果為阿文可以選擇的數字有哪些?總共有幾個? 
		 */
		int count = 0;
		int i, j;
//		for ( i = 1; i <= 49; i++) {
//			if (!(Integer.toString(i).contains("4"))) {
//				count++;
//				System.out.print(i + " ");
//			}
//		}
//		for (i = 1; i <= 49; i++) {
//			if (i / 10 != 4 && i % 10 != 4) {
//				System.out.println(i);
//				count++;
//			}
//		}
//		System.out.println("總共有: " + count + " 個");

//		count=0;
		for (i = 0; i <= 4; i++) {
			for (j = 0; j <= 9; j++) {
				if (i == 4 || j == 4 || (i == 0 && j == 0)) {
					continue;
				} else {
					count++;
					if (i != 0) {
						System.out.print(i);
					}
					System.out.print(j + " ");
				}
			}
		}
		System.out.println("總共有: " + count + " 個");
	}
}
