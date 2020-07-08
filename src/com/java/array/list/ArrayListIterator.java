package com.java.array.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class ArrayListIterator 
{
	public static void main(String[] args) 
	{

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2,4,6,8));
		System.out.println("List size: " + list.size());
		
	
		System.out.println(list);
		for(int i : list)
			System.out.print(i + "\t");
		System.out.println();
		System.out.println("Using Iterator method");
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
			System.out.print(it.next() + "\t");
		System.out.println();
		
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(22,42,62,82,32));
		System.out.println(list1);
		
	}
}
