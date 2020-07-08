package com.java.arrays;

import java.util.Arrays;

//Bubble sort

public class SortArray 
{
	public static void main(String[] args) 
	{
		int[] intArray = {33, 11, 77, 33, 99, 44, 11, 22, 66, 77};
		String[] strArray = {"Apple", "Eat", "Dog", "Call", "Ball", "Eat"};
		char[] charArray = {'A', 'E', 'B', 'D', 'C', 'A'};
		
		intSort(intArray);
		strSort(strArray);
		charSort(charArray);
	}
	

	
	static void charSort(char[] charArray)
	{			
		System.out.println(Arrays.toString(charArray));
		for(int i=0; i<charArray.length-1; i++)
			for(int j=i+1; j<charArray.length; j++)
			{
				if(charArray[i] > charArray[j])
				{
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
					
				}
			}
		
		System.out.println(Arrays.toString(charArray));
	}
	
	
	static void strSort(String[] strArray)
	{
		System.out.println(Arrays.toString(strArray));
		for(int i=0; i<strArray.length; i++)
			for(int j=i+1; j<strArray.length; j++)
			{
				if(strArray[i].compareTo(strArray[j])>0)
				{
					String temp = strArray[i];
					strArray[i] = strArray[j];
					strArray[j] = temp;
					
				}
			}
		System.out.println(Arrays.toString(strArray));
	}
	
	
	static void intSort(int[] intArray)
	{
		if(intArray.length > 1)
		{
			System.out.println(Arrays.toString(intArray));
			for(int i=0; i<intArray.length; i++)
				for(int j=i+1; j<intArray.length; j++)
				{
					int temp=0;
					if(intArray[i]>intArray[j])
					{
						temp = intArray[i];
						intArray[i] = intArray[j];
						intArray[j] = temp;
					}
				}
			System.out.println(Arrays.toString(intArray));
		}
		else
			System.out.println("Array size is less than 2");
		
	}

}
