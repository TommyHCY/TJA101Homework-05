package hw1;

public class SecMinHourDay {
	public static void main(String[] args) {
		int secs = 256559;
		int mins = (int) secs / 60;
		int hours = (int) mins / 60;
		int days = (int) hours / 24;
		int sec = secs % 60;
		int min = mins % 60;
		int hour = hours % 24;
		System.out.println(days + "天 " + hour + "小時 " + min + "分 " + sec + "秒");

	}

}
