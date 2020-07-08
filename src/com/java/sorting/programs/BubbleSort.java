package com.java.sorting.programs;

import java.util.Arrays;

public class BubbleSort
{

	public static void main(String[] args) 
	{

		int[] arr = {3, 2, 7, 4, 1, 5, 9, 6, 8, 5, 10};
		int length = arr.length;
		
		System.out.println("Before: " + Arrays.toString(arr));
		
		for(int i=0; i<length; i++)
		{
			for(int j=i; j<length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Ascending order: " + Arrays.toString(arr));
		
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Descending order: " + Arrays.toString(arr));
		
	}

}
