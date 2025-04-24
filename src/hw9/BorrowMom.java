package hw9;

class Balance {
	private int balance = 0;

	synchronized public void save(int money) {
		while (balance > 3000) {
			System.out.println("熊媽看到金額超過3000元,停止匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += money;
		System.out.println("存入：" + money + "；戶頭：" + balance);
		notify();
	}

	synchronized public void take(int money) {
		while (balance < money) {
			System.out.println("戶頭沒錢，暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= money;
		System.out.println("取出：" + money + "；戶頭" + balance);
		if (balance < 2000) {
			System.out.println("戶頭快沒錢，熊媽救命");
			notify();
		}
	}
}

class MonSave extends Thread {
	Balance balance;

	public MonSave(Balance balance) {
		this.balance = balance;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			balance.save(2000); // 每次存2000
	}
}

class ChildTake extends Thread {
	Balance balance;

	public ChildTake(Balance balance) {
		this.balance = balance;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			balance.take(1000); // 每次取1000
	}
}

public class BorrowMom {

	public static void main(String[] args) {
		Balance balance = new Balance();
		MonSave mon = new MonSave(balance);
		ChildTake child = new ChildTake(balance);
		mon.start();
		child.start();

	}

}
