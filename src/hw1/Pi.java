package hw1;

public class Pi {
	public static void main(String[] args) {
		final double PI = 3.1425;
		int radius = 5;
		double area = radius * radius * PI;
		double perimeter = radius * 2 * PI;
		System.out.println("面積: " + area + "周長: " + perimeter);
	}
}
