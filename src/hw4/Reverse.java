package hw4;

public class Reverse {

	public static void main(String[] args) {
		String s = "Hello World";
		printReverse(s);
	}

	public static void printReverse(String s) {
		char[] c = s.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);

		}
	}
}
