package hw5ext;
public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		
		saber.attack();
		saber.move();
		
		archer.attack();
		archer.move();
	}

}
