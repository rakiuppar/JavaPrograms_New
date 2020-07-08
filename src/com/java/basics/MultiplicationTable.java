package com.java.basics;

public class MultiplicationTable {

	public static void main(String[] args) {

		int num = 5;
		
		for(int i=1; i<11; i++)
		{

			System.out.println(num + " * " + i + " = " + num*i);
			
		}
		System.out.println("------------------");
		
		int start = 1;
		int end = 10;
		
		while(start<=end)
		{
			System.out.println(num + " * " + start + " = " + num*start);
			start+=1;
		}
		
		
			
	}

}
