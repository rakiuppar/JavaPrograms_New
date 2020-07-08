package com.java.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
	
		//iteration method 1
		System.out.println("Method 1");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		//iteration method 2
		System.out.println("Method 2");
		for (int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		//Iteratin method 3
		System.out.println("Method 3");
		for(int temp:list)
		{
			System.out.println(temp);
		}
		
		
		//Other operations
		System.out.println("Other operations");
		System.out.println(list.indexOf(13));
		System.out.println(list.isEmpty());
		System.out.println(list.lastIndexOf(list));
		System.out.println(list.remove(list.size()-1));
		System.out.println(list.set(0, 88));
		
		System.out.println("Advance for lop");
		for(int temp:list)
		{
			System.out.println(temp);
		}
	}	

}
