package hw4;

public class SixExamEightStu {

	public static void main(String[] args) {
		int[][] stuExamScore = {
//				6 * 8 = 考試 * 學生
				{ 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int[] highScore = new int[6];
//		System.out.println(stuExamScore.length);
//		System.out.println(stuExamScore[1].length);
		// 每位同學考最高成績的次數
		int[] stuCount = new int[8];
		for (int i = 0; i < stuExamScore.length; i++) {
			int stuScore = 0;
			for (int j = 0; j < stuExamScore[i].length; j++) {
				if (stuScore < stuExamScore[i][j]) {
					stuScore = stuExamScore[i][j];
				}
				highScore[i] = stuScore;
			}
		}
		for (int i = 0; i < stuExamScore.length; i++) {
			for (int j = 0; j < stuExamScore[i].length; j++) {
				if (stuExamScore[i][j] == highScore[i]) {
					stuCount[j]++;
				}
			}
		}
//		for (int score : highScore) {
//			System.out.println(score);
//		}
		for (int count = 0; count < stuCount.length; count++) {
			System.out.println("學生 " + (count + 1) + " 號考最高分的次數為 " + stuCount[count] + " 次");
		}

	}

}
