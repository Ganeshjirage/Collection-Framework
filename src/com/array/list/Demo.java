package com.array.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class Demo {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push("Ganesh");

//		System.out.println(stack);
//
//		System.out.println(stack.pop());
//
//		System.out.println(stack.peek());
//		System.out.println(stack.search(40));
		ArrayList arrayList = new ArrayList();
		arrayList.add(50);
		arrayList.add(75);
		arrayList.add(100);
		arrayList.add(75);
		System.out.println("List is=" + arrayList);

		HashSet hashSet = new HashSet(arrayList);
		System.out.println(hashSet);

	}

}
