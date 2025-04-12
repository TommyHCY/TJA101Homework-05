package hw6;

public class CalTest {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		try {
			c.powerXY(0, 0);
		} catch (CalException e) {
		}
	}
}
