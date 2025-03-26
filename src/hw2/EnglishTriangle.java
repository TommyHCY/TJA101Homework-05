package hw2;

public class EnglishTriangle {

	public static void main(String[] args) {
		int cha = 64; // A的unicode是65，由於要for i控制，所以用64

		/*
		 * 輸出結果為以下: A BB CCC DDDD EEEEE FFFFFF
		 */
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(cha+i));
//				switch (i) {
//				case 1:
//					System.out.print('A');
//					break;
//				case 2:
//					System.out.print('B');
//					break;
//				case 3:
//					System.out.print('C');
//					break;
//				case 4:
//					System.out.print('D');
//					break;
//				case 5:
//					System.out.print('E');
//					break;
//				case 6:
//					System.out.print('F');
//					break;
//				}

			}
			System.out.println();
		}

	}

}
