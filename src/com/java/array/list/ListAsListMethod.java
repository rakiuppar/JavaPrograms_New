package com.java.array.list;

import java.util.ArrayList;
import java.util.Arrays;

//Bubble sort

public class ListAsListMethod 
{
	public static void main(String[] args) 
	{
		Integer[] arr = {2,4,6,8};
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		
		System.out.println("Arrays to Array list");
		ArrayList<Integer> newList = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(newList);
		System.out.println("--------------------------");
		
		System.out.println("Array List to Arrays");
		Integer[] newArr = new Integer[list.size()];
		list.toArray(newArr);
		for(int i : newArr)
		System.out.print(i + "\t");
		
	}
}
