package hw4;

public class AvgMaxArray {

	public static void main(String[] args) {
		int[] arr = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		printAvgMax(arr);
	}

	public static void printAvgMax(int[] arr) {
		int avg = 0;

		for (int i = 0; i < arr.length; i++) {
			avg += arr[i];
		}
//		System.out.println(arr.length);
		avg = avg / arr.length;
		System.out.println("平均數" + avg);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > avg) {
				System.out.print(arr[i] + "\t");
			}
		}
	}

}
