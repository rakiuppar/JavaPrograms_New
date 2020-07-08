package com.java.basics;

public class NumberReverse 
{

	public static void main(String[] args) 
	{

		int num = 1234560;
		int count = 0;
		
		while(num!=0)
		{
			num = num/10;
			count++;
		}
		System.out.println(count);
	}
}
