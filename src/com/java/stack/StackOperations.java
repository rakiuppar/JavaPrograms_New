package com.java.stack;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//Bubble sort

public class StackOperations 
{
	public static void main(String[] args) 
	{
		Stack<Integer> intStack = new Stack<Integer>();
		Stack<String> strStack = new Stack<String>();
		
		System.out.println(intStack.isEmpty());
		intStack.push(11);
		intStack.push(33);
		intStack.push(55);
		System.out.println(intStack);
		System.out.println(intStack.capacity());
		System.out.println(intStack.peek());
		System.out.println(intStack.pop());
		System.out.println(intStack.remove(0));
		System.out.println(intStack);
		System.out.println(intStack.isEmpty());
		
		System.out.println();
		System.out.println("----------------------------------");
		
		strStack.add("apple");
		strStack.push("Ball");
		strStack.push("Cat");
		
		for(String a : strStack)
			System.out.print(a + "\t");

	}
}
