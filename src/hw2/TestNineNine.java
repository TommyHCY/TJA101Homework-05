package hw2;

public class TestNineNine {

	public static void main(String[] args) {
		int j = 0, i;
		for (i = 1; i <= 9; i++) {
			while (j < 9) {
				j++;
				System.out.print(i + " * " + j + " = " + i * j + "\t");
			}
			System.out.println();
			j = 0;
		}

		System.out.println("-----------------------");

		do {
			j++;
			for (i = 1; i <= 9; i++) {
				System.out.print(j + " * " + i + " = " + i * j + "\t");
			}
			System.out.println();
		} while (j < 9);

		System.out.println("-----------------------");

		i = 0;
		j = 0;

		while (i < 9) {
			i++;
			while (j < 9) {
				j++;
				System.out.print(i + " * " + j + " = " + i * j + "\t");
			}
			j = 0;
			System.out.println();
		}
	}
}
