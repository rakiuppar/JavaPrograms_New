package com.java.basics;

public class ArmStrongNumber 
{
	public static void main(String[] args) 
	{

		check(153);
		check(178);
		check(999);
		check(370);
		check(371);
		
	}

	
	static void check(int num)
	{
		int originalNum = num;
		int cube = 0;
		int r;
		
		while(num != 0)
		{
			r = num % 10;
			num = num / 10;
			cube = cube + (r*r*r);	
		}
		
		if(originalNum == cube)
			System.out.println(originalNum + " is an Armstrong Number");
		else
			System.out.println(originalNum + " is not an Armstrong Number");
		
	}
	
	
}
