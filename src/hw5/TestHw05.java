package hw5;

public class TestHw05 {

	public static void main(String[] args) {
//		PrintRect ps = new PrintRect();
//		ps.starSquare(4, 2);
// ====================================================
//		RandomAvg ra = new RandomAvg();
//		ra.randAvg();
// ====================================================
//		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
//		double[][] doubleArray = { { 7.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
//
//		MaxTwoDes mtd = new MaxTwoDes();
//		System.out.println(mtd.maxElement(intArray));
//		System.out.println(mtd.maxElement(doubleArray));
// ====================================================
		VerifyCode vc = new VerifyCode();
		System.out.println(vc.genAuthCode());

	}

}
