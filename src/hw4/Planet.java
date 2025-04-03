package hw4;

public class Planet {

	public static void main(String[] args) {
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		printaeiou(planets);
	}

	public static void printaeiou(String[] s) {
		int acount = 0;
		int ecount = 0;
		int icount = 0;
		int ocount = 0;
		int ucount = 0;

		for (int i = 0; i < s.length; i++) {
			char[] planet = s[i].toCharArray();
			for (int j = 0; j < planet.length; j++) {
// 也許可以用其他方式 字元得比對??
				switch (planet[j]) {
				case 'a':
					acount++;
					continue;
				case 'e':
					ecount++;
					continue;
				case 'i':
					icount++;
					continue;
				case 'o':
					ocount++;
					continue;
				case 'u':
					ucount++;
					continue;

				}
			}
		}
		System.out.println("a : " + acount);
		System.out.println("e : " + ecount);
		System.out.println("i : " + icount);
		System.out.println("o : " + ocount);
		System.out.println("u : " + ucount);

	}

}
