package com.java.basics;

public class Constructors 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World ....");
		InnerClass3 inner1 = new InnerClass3();
		InnerClass3 inner2 = new InnerClass3("Sara");
		InnerClass3 inner3 = new InnerClass3("ALi", 44);
		InnerClass3 inner4 = new InnerClass3("Sanju", 66, 88);
		

		
	}
}

class InnerClass3
{
	private String name="Rakesh";
	private int age = 25;
	private int id = 45;
	
	
	public InnerClass3()
	{
		this("Constructor");
		
		System.out.println("Inside constructor 1");
		System.out.println(name);
		System.out.println(age);
		System.out.println(id);
	}
	public InnerClass3(String name)
	{
		System.out.println("Inside constructor 2");
//		this.name=name;
		System.out.println(name);
		System.out.println(age);
		System.out.println(id);
	}
	public InnerClass3(String name, int age)
	{
		System.out.println("Inside constructor 3");
		this.name=name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);
		System.out.println(id);
	}
	public InnerClass3(String name, int age, int id)
	{
		System.out.println("Inside constructor 4");
		this.name=name;
		this.age=age;
		this.id=id;
		System.out.println(name);
		System.out.println(age);
		System.out.println(id);
	}
	
}

