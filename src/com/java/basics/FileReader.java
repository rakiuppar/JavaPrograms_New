package com.java.basics;

import java.util.Scanner;

public class FileReader 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World !!!");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Integer");
		int val = scan.nextInt();
		System.out.println(val);
		
		System.out.println("Enter a String");
		String val1 = scan.next("Hi");
		System.out.println(val1);
	}

}
