package hw1;

public class BankRate {
	public static void main(String[] args) {
		double pv = 1_500_000;
		double rate = 0.05;
		double yearRate = rate + 1;
//		int fv;
		for (int i = 0; i < 10; i++) {
			pv *= yearRate;

		}
//		fv = (int) (pv);
		System.out.println("本利合為: " + pv);
	}

}
