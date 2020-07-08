package com.recurssion.programs;

public class Factorial 
{

	public static void main(String[] args) 
	{
		int total = fact(4);
		
		System.out.println(total);
	}

	static int fact(int n)
	{
		if(n<1)
			return 1;
		else
			return (n * fact(n-1));
	}
}
