package com.java.linkedlist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Bubble sort

public class LinkedListReverseIterator 
{
	public static void main(String[] args) 
	{

		LinkedList<Integer> linked1 = new LinkedList<Integer>();
		List<String> linked2 = new LinkedList<String>();
		
		linked1.add(11);
		linked1.add(22);
		linked1.add(33);
		System.out.println(linked1);

		ListIterator<Integer> it = linked1.listIterator();
		System.out.println("Linked list in forward direction");
		while(it.hasNext())
			System.out.print(it.next() + "\t");
		
		System.out.println();
		System.out.println("Reversing List");
		System.out.println("Linked list in backward direction");
		while(it.hasPrevious())
			System.out.print(it.previous() + "\t");
		
		System.out.println();
		System.out.println("Search in Linked list");
		System.out.println(linked1.contains(22));
		System.out.println(linked1.contains(99));
		
		System.out.println("Index in Linked list");
		System.out.println(linked1.indexOf(22));
		System.out.println(linked1.indexOf(111));
		
		System.out.println("Adding items to existing Linked list");
		linked1.add(44);
		linked1.add(55);
		System.out.println(linked1);
		
		System.out.println("Updating the items within Linked list");
		linked1.set(0, 888);
		linked1.set(1, 999);
		System.out.println(linked1);
		
		
		System.out.println("Deleting an element from linked list");
		linked1.remove(0);
		System.out.println(linked1);

		System.out.println("Remove all elements");
		linked1.clear();
		System.out.println(linked1);
	}
}
