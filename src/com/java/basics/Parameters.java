package com.java.basics;

import java.util.Scanner;

public class Parameters 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Start");
		
		AnotherClass2 another=new AnotherClass2();
		another.speak();
		another.speak(55);
		another.speak("Sara");
		
	}
}

class AnotherClass2
{
	void speak() 
	{
		System.out.println("Common speak");
	}
	
	void speak(String Name)
	{
		System.out.println(Name);
	}
	
	void speak(int Age)
	{
		System.out.println(Age);
	}
	
}

