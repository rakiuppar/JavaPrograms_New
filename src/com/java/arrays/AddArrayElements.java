package com.java.arrays;

import java.util.Arrays;

//Bubble sort

public class AddArrayElements 
{
	public static void main(String[] args) 
	{
		int[] intArray = {33, 11, 77, 33, 99, 44, 12, 22, 66, 77, 12};
		int element = 12;


		if(check(intArray, element) == true)
			System.out.println("Element found");
		else
			System.out.println("Element NOT found");
		System.out.println("----------------------");
		checkWithPosition(intArray, element);
	}
	
	static boolean check(int[] array, int element)
	{
		for(int i : array)
			if(i == element)
				return true;
		return false;
	}
	
	static void checkWithPosition(int[] array, int element)
	{
		int count = 0;
		int counter = 0;
		
		for(int i=0; i<array.length; i++)
			if(array[i] == element)
			{
				System.out.println("Element " + array[i] + " found at index: " + i);
				counter = 1;
			}
		if(counter == 0)
			System.out.println("Element not found");
				
	}
	

}
