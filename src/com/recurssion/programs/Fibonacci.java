package com.recurssion.programs;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		int total = fib(4);
		
		System.out.println(total);
	}

	
	static int fib(int n)
	{
		int first=0;
		int second=1;
		int sum = 0;
		
		if(n>0)
			sum = first+ second;
			first = second;
			second = sum;
			
			System.out.println(sum);
			
			fib(n-1); 
		return sum;

	}
}
 