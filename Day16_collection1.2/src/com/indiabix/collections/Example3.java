package com.indiabix.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example3 {

	public static void main(String[] args) {
		Deque d=new ArrayDeque();
		d.add(13);
		d.add("Tilak");
		System.out.println(d);
		d.addFirst(12);
		d.addLast("Chandele");
		System.out.println(d);
		d.removeFirst();
		d.removeLast();
		System.out.println(d);

	}

}