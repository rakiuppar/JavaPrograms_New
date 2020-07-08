package com.java.basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterationTypes {

	public static void main(String[] args) {
		String a = "java";
		String b = "java";
		String c = "java";
		System.out.println("a:" + a + "\t\tb:" + b + "\t\tc:" + c);
		c = "python";
		System.out.println("a:" + a + "\t\tb:" + b + "\t\tc:" + c);

		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("def");
		list.add("pqr");
		list.add("xyz");

		System.out.println();
		System.out.println();
		System.out.println("Using for each Lamda Expression ------------------------");

		list.forEach(items -> {
			System.out.print(items + "\t ");
		});

		System.out.println();
		System.out.println();
		System.out.println("Using Iterator method ------------------------");

		Iterator<String> it = list.iterator();
		while (it.hasNext())
			System.out.print(it.next() + "\t ");

		System.out.println();
		System.out.println();
		System.out.println("Using advance for loop ------------------------");

		for (String item : list)
			System.out.print(item + "\t ");

		System.out.println();
		System.out.println();
		System.out.println("Using iterator wth Lamda------------------------");

		Iterator<String> it1 = list.iterator();
		it1.forEachRemaining(item1 -> {

			System.out.print(item1 + "\t ");
		});

		System.out.println();
		System.out.println();
		System.out.println("Using simple for loop------------------------");
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + "\t ");

		System.out.println();
		System.out.println();
		System.out.println("Using ListIteration (we can traverse back as well) ------------------------");
		ListIterator<String> it3 = list.listIterator();
		while (it3.hasNext())
			System.out.print(it3.next() + "\t ");
		System.out.println();

		while (it3.hasPrevious())
			System.out.print(it3.previous() + "\t ");
	}

}
