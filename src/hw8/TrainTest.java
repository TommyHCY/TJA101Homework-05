package hw8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TrainTest {

	public static void main(String[] args) {
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

		Object ts[] = { t1, t2, t3, t4, t5, t6, t7 };

		Set<Object> trains = new TreeSet<Object>();
		for (int i = 0; i < ts.length; i++) {
			trains.add(ts[i]);
		}

//		Iterator 
		Iterator<Object> objs = trains.iterator();
		int count = 0;
		while (objs.hasNext() && count <= 20) {
			System.out.println(objs.next() + "\t");
			count++;
		}

		System.out.println();

//		forEach
		for (Object object : trains) {
			System.out.println(object.toString());
		}

//		班次編號由大到小印出
//		TreeSet train 實作Comparable
//		編號由大排到小印出，還可以不重複印出Train物件
//		TreeSet train 實作Comparable

	}

}
