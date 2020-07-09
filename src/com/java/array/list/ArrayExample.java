package com.java.array.list;

import java.util.Arrays;

//Bubble sort

public class ArrayExample 
{
	public static void main(String[] args) 
	{
		// Adding the code from new branch created with User 1
		// Test to push the code
		
		
		// Adding the code from new branch created with User 1
		// Test to push the code
		
		
		// Adding the code from new branch created with User 1
		// Test to push the code
		int[] intArray = {33, 11, 77, 33, 99, 44, 12, 22, 66, 77, 12, 55};
		int element = 44;
		
		// This line is added from pulled branch
		
		System.out.println("Legnth of Array: "+ intArray.length);
		System.out.println(Arrays.toString(intArray));
		
		Arrays.sort(intArray);
		
		System.out.println(Arrays.toString(intArray));
		
		System.out.println("Element "+ element +" found at index: " + Arrays.binarySearch(intArray, element));

	}
}
