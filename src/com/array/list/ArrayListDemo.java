package com.array.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add("Ganesh");
		al.add(null);
		al.add(10.5);
		al.remove(1);

		al.forEach(forEach -> System.out.println(forEach));
		// System.out.println(al.size());

		// List list = Collections.synchronizedList(al);
		// System.out.println(list);

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("TATA");
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		ArrayList arr = new ArrayList();
		arr.addAll(al);
		arr.addAll(cars);

		// System.out.println(arr);
//		for (Object o : arr) {
//			System.out.println(o);
//		}

		// al.addAll(cars);
		// System.out.println(al);
//		System.out.println(al.size());
//		System.out.println(al.contains(80));
//		System.out.println(al.contains(10.5));

//		Collections.sort(cars);
//		// System.out.println(cars);
//
//		for (String i : cars) {
//			// System.out.println(i);
//		}
//		Iterator itr = al.iterator();
//		while (itr.hasNext()) {
//			// System.out.println(itr.next());
//		}

	}

}
