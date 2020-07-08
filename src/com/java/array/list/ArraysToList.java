package com.java.array.list;

import java.util.ArrayList;
import java.util.Arrays;

//Bubble sort

public class ArraysToList 
{
	public static void main(String[] args) 
	{

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		System.out.println("List size: " + list.size());
		System.out.println(list);
		System.out.println("--------------------------");
		System.out.println("Adding numbers to the list");
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		System.out.println("List size: " + list.size());
		System.out.println(list);
		
		System.out.println("--------------------------");
		ArrayList<String> newList = new ArrayList<String>(Arrays.asList("apple", "ball", "cap"));
		System.out.println("List size: " + newList.size());
		System.out.println(newList);
		
	}
}
