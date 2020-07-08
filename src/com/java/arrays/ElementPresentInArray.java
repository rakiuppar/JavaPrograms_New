package com.java.arrays;

import java.util.Arrays;

//Bubble sort

public class ElementPresentInArray 
{
	public static void main(String[] args) 
	{
		int[] intArray = {33, 11, 77, 33, 99, 44, 12, 22, 66, 77};
		int sum=0;
		int count = intArray.length;
		double average = 0;

		System.out.print("Sum of all elements: ");
		for(int i : intArray)
			sum += i;
		System.out.println(sum);
		System.out.println(sum/count);
	
	}

}
