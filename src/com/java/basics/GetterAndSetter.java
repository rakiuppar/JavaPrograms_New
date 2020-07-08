package com.java.basics;

import java.util.Scanner;

public class GetterAndSetter 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World ....");
		
		InnerClass1 inner=new InnerClass1();
		inner.setName("Sara");
		inner.setAge(24);
		inner.setId(58);
		System.out.println("Name is: " + inner.getName());
		System.out.println("Age is: " + inner.getAge());
		System.out.println("Id is: " + inner.getId());
		
		System.out.println("------------");
		
		inner.setAll("Scoff",26,567);
		System.out.println("Name is: " + inner.getName());
		System.out.println("Age is: " + inner.getAge());
		System.out.println("Id is: " + inner.getId());

		
	}
}

class InnerClass1
{
	private String name;
	private int age;
	private int id;
	
	String getName()
	{
		return name;
	}
	
	int getAge()
	{
		return age;
	}
	
	int getId()
	{
		return id;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	
	void setAge(int age)
	{
		this.age=age;
	}
	
	void setId(int id)
	{
		this.id=id;
	}
	
	void setAll(String name, int age, int id)
	{
		setName(name);
		setAge(age);
		setId(id);
	}
	
}

