package com.java.arrays;

import java.util.Arrays;

public class SortArray2 
{
	public static void main(String[] args) 
	{
		int[] intArray = {33, 55, 11, 77, 99, 66, 22, 44, 88, 22};
		String[] strArray = {"Apple", "Eat", "Dog", "Call", "Ball", "Eat"};
		char[] charArray = {'A', 'E', 'B', 'D', 'C', 'A'};
		
		System.out.println("---------- Int Type ------------");
		System.out.println("Before Sort Int: " + Arrays.toString(intArray));
		Arrays.sort(intArray);
		System.out.println("After Sort Int: " + Arrays.toString(intArray));
		
		System.out.println("---------- String Type ------------");
		System.out.println("Before Sort String: " + Arrays.toString(strArray));
		Arrays.sort(strArray);
		System.out.println("After Sort String: " + Arrays.toString(strArray));
		
		System.out.println("---------- Char Type ------------");
		System.out.println("Before Sort String: " + Arrays.toString(charArray));
		Arrays.sort(charArray);
		System.out.println("After Sort String: " + Arrays.toString(charArray));
	
		
	}
	
	

}
