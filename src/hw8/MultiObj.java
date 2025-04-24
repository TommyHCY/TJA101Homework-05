package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultiObj {

	public static void main(String[] args) {
		BigInteger bi = new BigInteger("1000");
		Object objx = new Object();
		ArrayList list = new ArrayList();
		list.add((int) 100);
		list.add((double) 3.14);
		list.add((long) 21L);
		list.add((short) 100);
		list.add((double) 5.1);
		list.add("Kitty");
		list.add((int) 100);
		list.add(objx);
		list.add("snoopy");
		list.add(bi);

//		Iterator
//		Iterator objs =list.iterator();
//		while(objs.hasNext()) {
//			System.out.print(objs.next()+"\t");
//		}

//		for
//		for (int i = 0; i < list.size(); i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//		}
//		forEach
//		for (Object object : list) {
//			System.out.print(object+"\t");
//		}
//		printAll
		for (Object object : list) {
			System.out.print(object + "\t");
		}
		System.out.println();

//		 if (list.get(8) instanceof Number) {
//			 System.out.println(list.get(8));
//			System.out.println("YYYY");
//			
//		}else {
//			System.out.println("NNN");
//		}

		Iterator objs = list.iterator();
		while (objs.hasNext()) {
			Object object = objs.next();
			if (!(object instanceof Number)) {

				objs.remove();

			}
//			System.out.print(objs.next()+"\t");
		}

		for (Object object : list) {
			System.out.print(object + "\t");
		}

	}

}
