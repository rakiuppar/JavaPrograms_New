package com.recurssion.programs;

public class Recurssion 
{

	public static void main(String[] args) 
	{
		System.out.println(factorial(3));
		
	}

	static void recursive1(int n)
	{
		if(n<1)
			return;
		else
		{
			System.out.println("Before Recursive loop: " + n);
			recursive1(n-1);
		}
		System.out.println("Recursive loop: " + n);
	}
	
	static void recursive2(int n)
	{
		if(n<0)
			return;
		else
		{
			recursive2(n-1);
		}
		System.out.println("Recurrion loop: " + n);
	}
	
	static int factorial(int n)
	{
		int fact=1;
		if(n<1)
			return 1;
		else 
			 return (n * factorial(n-1));
		
	}
}
