package hw5;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle rect1 = new MyRectangle();
		rect1.setDepth(20);
		rect1.setWeith(10);
		System.out.println(rect1.getArea());
		
		MyRectangle rect2 = new MyRectangle(10,20);
		System.out.println(rect2.getArea());
	}

}
