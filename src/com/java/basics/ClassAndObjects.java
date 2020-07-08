package com.java.basics;

import java.util.Scanner;

public class ClassAndObjects 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Start");
		
		Student st1 = new Student();
		System.out.println(st1.name);
		System.out.println(st1.age);
		System.out.println(st1.id);
		College col1=new College();
		col1.colDetails();
		
		Student st2 = new Student();
		st2.name="Sha";
		st2.age=33;
		st2.id=45;
		System.out.println(st2.name);
		System.out.println(st2.age);
		System.out.println(st2.id);
		System.out.println("-----------");
		st2.StuDetails();
		System.out.println("-----------");
		st1.StuDetails();
		
	}
}

class Student
{
	String name = "Anu";
	int age = 22;
	int id = 68;
	
	void StuDetails()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(id);
	}
}

class College
{
	String collegeName="PDA";
	String place="Gulbarga";
	
	void colDetails()
	{
		System.out.println(collegeName);
		System.out.println(place);
	}
}
