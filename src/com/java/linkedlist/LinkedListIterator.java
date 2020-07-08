package com.java.linkedlist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Bubble sort

public class LinkedListIterator 
{
	public static void main(String[] args) 
	{

		LinkedList<Integer> linked1 = new LinkedList<Integer>();
		List<String> linked2 = new LinkedList<String>();
		
		linked1.add(11);
		linked1.add(22);
		linked1.add(33);
		System.out.println(linked1);
		for(int i : linked1)
			System.out.print(i + "\t");
		System.out.println();
		
		linked1.addFirst(01);
		System.out.println(linked1);
		System.out.println(linked1.contains(22));
		System.out.println("----------------------------------");
		
		linked1.get(0);
		Iterator<Integer> it = linked1.iterator();
		while(it.hasNext())
			System.out.print(it.next() + "\t");
	}
}
