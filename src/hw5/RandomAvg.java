package hw5;

public class RandomAvg {

	public void randAvg() {
		System.out.println("本次亂數結果:");
		int total = 0;

		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 100) + 1;
			System.out.print(num+"  ");
			total += num;
		}
		System.out.println();
		int avg = total / 10;
		System.out.println(avg);
	}

}
