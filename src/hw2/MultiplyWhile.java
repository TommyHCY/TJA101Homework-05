package hw2;

public class MultiplyWhile {

	public static void main(String[] args) {
		// 計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int i = 0;
		int mult = 1;
		while (i++ < 10) {
			mult *= i;
//			System.out.println(i);
//			i++;
//			System.out.println(mult);
		}
		System.out.println(mult);
		
	}

}
