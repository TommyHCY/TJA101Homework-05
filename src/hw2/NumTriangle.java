package hw2;

public class NumTriangle {

	public static void main(String[] args) {
		/*
		 * 輸出結果為以下: 
		 * 
		 */
		for (int i = 11; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
