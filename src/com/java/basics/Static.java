package com.java.basics;

public class Static 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World ....");
		
		//Accessing Static Variables and methods
		InnerClass4.str2 = "Static Stirng";
		InnerClass4.setString2();

		//Accessing Non Static Variables and methods
		InnerClass4 inner = new InnerClass4();
		inner.str1 = "Non Static String";
		inner.setString1();

	}
}

class InnerClass4
{
	public String str1;
	public static String str2;
	
	public void setString1()
	{
		System.out.println("-------Inside Non static Method");
		System.out.println(str1);
		System.out.println(str2);
	}
	
	public static void setString2()
	{
		System.out.println("-------Inside static Method");
// 		System.out.println(str1); // Non static cannot be called inside Static
		System.out.println(str2);
	}
	
}

