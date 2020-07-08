package com.java.arrays;

import java.util.Arrays;

//Bubble sort

public class ReadArray 
{
	public static void main(String[] args) 
	{
		int[] intArray = {33, 11, 77, 33, 99, 44, 11, 22, 66, 77};
		String[] strArray = {"Apple", "Eat", "Dog", "Call", "Ball", "Eat"};
		char[] charArray = {'A', 'E', 'B', 'D', 'C', 'A'};

		System.out.println("For loop --------");
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " ");
		System.out.println();
		
		for(int i=0; i<strArray.length; i++)
			System.out.print(strArray[i] + " ");
		System.out.println();
		
		for(int i=0; i<charArray.length; i++)
			System.out.print(charArray[i] + " ");
		System.out.println();
		System.out.println();
		
		
		System.out.println("Advance For loop --------");
		for(int i : intArray)
			System.out.print(i + " ");
		System.out.println();
		
		for(String i : strArray)
			System.out.print(i + " ");
		System.out.println();
		
		for(char i : charArray)
			System.out.print(i + " ");
	}

}
