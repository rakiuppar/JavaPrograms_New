package com.java.basics;

public class NumberPalindrome 
{

	public static void main(String[] args) 
	{

		int num = 130031;
		int original = num;
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;			
			num = num/10;
		}
		
		System.out.println(original);
		if(original == rev)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
}
