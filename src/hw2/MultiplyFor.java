package hw2;

public class MultiplyFor {

	public static void main(String[] args) {
		// 計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int mult = 1;
		for (int i = 1; i <= 10; i++) {
			mult *= i;
//			System.out.println(i);
			System.out.println(mult);
		}
		System.out.println(mult);
	}

}
