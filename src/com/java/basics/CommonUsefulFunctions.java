package com.java.basics;

public class CommonUsefulFunctions 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World ....");
		int a = 8020;
		double b = 56.8;
		String s = "4";
		
		System.out.println("------Character");
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isDigit('d'));
		
		System.out.println("------Integer");
		System.out.println(Integer.numberOfLeadingZeros(a));
		System.out.println(Integer.reverse(a));
	
		System.out.println("------Math");
		System.out.println(Math.max(12, 33));
		System.out.println(Math.random());
		System.out.println(Math.incrementExact(a));
		

		System.out.println("------String");
		System.out.println(String.valueOf(s));
		System.out.println();
		
	}
}

class InnerClass5
{

	
}

