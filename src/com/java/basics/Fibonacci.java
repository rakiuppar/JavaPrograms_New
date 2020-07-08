package com.java.basics;

public class Fibonacci 
{

	public static void main(String[] args) 
	{

		int first = 0;
		int second = 1;
		int num = 8;
		int third;
		
		if(num <= 0)
			System.out.println("Enter valid number");
		
		else if(num <= 1)
			System.out.print(first + " " + second);

		else
			{
				for(int i=1; i<=num; i++)
				{
				System.out.print(first + " ");
				
				third = first + second;
				first = second;
				second = third;
				}
			}
	
	}
}
