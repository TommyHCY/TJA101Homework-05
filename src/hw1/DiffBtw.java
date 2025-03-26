package hw1;

public class DiffBtw {
	public static void main(String[] args) {
		System.out.println(5 + 5); // 整數相加 運算子代表把兩數相加
		System.out.println(5 + '5'); // '5' 會先轉換成Unicode編碼的53後與5相加等於58
		System.out.println(5 + "5"); // "5"為字串，與字串相加會變為串接因此為 55
		System.out.println('5' + '5');

	}

}
