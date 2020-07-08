package com.java.array.list;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListExample1 
{
	public static void main(String[] args) 
	{

		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Adding numbers to the list");
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		System.out.println("List size: " + list.size());
		
		System.out.println(list);
		
		for(int i : list)
			System.out.print(i + "\t");
		System.out.println();
		System.out.println("------------------------ ");
		
		System.out.println("Adding numbers to the list using index");
		list.add(0, 8);
		System.out.println(list);
		System.out.println("List size: " + list.size());
		
		System.out.println("------------------------ ");
		
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(1);
		newList.add(3);
		newList.add(5);
		System.out.println("New List");
		System.out.println(newList);
		
		list.addAll(newList);
		System.out.println("After adding new to old list");
		System.out.println(list);
		
		System.out.println("------------------------ ");
		System.out.println("Replace existing values");
		list.set(0, 0);
		list.set(1, 1);
		list.set(2, 2);
		System.out.println(list);
		
		System.out.println("------------------------ ");
		System.out.println("Deleting values");
		list.remove(0);
		list.remove(1);
		System.out.println(list);
		
		System.out.println("------------------------ ");
		System.out.println("Sorting array list");
		Collections.sort(list);
		System.out.println(list);
		
	}
}
