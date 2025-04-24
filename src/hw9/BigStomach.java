package hw9;

public class BigStomach implements Runnable {

	String name;

	public BigStomach(String name) {
		this.name = name;
	}

	int counter = 0;

	@Override
	public void run() {
		while (counter < 20) {
			System.out.println(this.name + "吃了第 " + counter + " 晚飯");
			counter++;

			try {

				int randomSleep = ((int) Math.random() * 2500 + 500);

				Thread.sleep(randomSleep); // 500-3000
			}

			catch (Exception e) {
			}
		}

	}

	public static void main(String[] args) {
		BigStomach b1 = new BigStomach("詹姆士");// 產生Runnable物件
//		r1.start(); 沒有 start方法
		Thread t1 = new Thread(b1); // 再由Runnable物件, 產生執行緒Thread物件
		BigStomach b2 = new BigStomach("饅頭人");
		Thread t2 = new Thread(b2);
		t1.start(); // 呼叫執行緒物件的start()方法(即啟動執行緒) , 隨即執行物件中的run方法
		t2.start();

	}

}
