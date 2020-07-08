package com.java.arrays;

import java.util.Arrays;

//Bubble sort

public class AverageOfArrayElements 
{
	public static void main(String[] args) 
	{
		int[] intArray = {31, 11, 77,23,52,61,57,88,12};
		int sum=0;
		double avg=0.0;
		int noOfElements = intArray.length;

		for(int i : intArray)
			sum += i;
		avg = sum/noOfElements;
		
		System.out.println("Total no of elements: "+ noOfElements);
		System.out.println("Sum of all elements: " + sum);
		System.out.println("Average of all elements: " + avg);
	
	}

}
