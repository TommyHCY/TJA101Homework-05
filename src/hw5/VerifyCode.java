package hw5;

public class VerifyCode {
	public String genAuthCode() {
		char[] c = new char[8];
		String orCode = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] c2 = orCode.toCharArray();
		String passWord = "";
		for (int i = 0; i < c.length; i++) {
			c[i] = c2[(int) (Math.random() * c2.length)];
		}
		for (int i = 0; i < c.length; i++) {
			passWord += c[i];
		}

		System.out.println("本次隨機產生驗證碼為: ");

		return passWord;
	}

}
