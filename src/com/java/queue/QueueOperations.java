package com.java.queue;

import java.util.PriorityQueue;

//Bubble sort

public class QueueOperations 
{
	public static void main(String[] args) 
	{

		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		pQueue.add(11);
		pQueue.offer(33);
		pQueue.add(55);
		pQueue.add(77);
		pQueue.add(99);
		System.out.println(pQueue);
		System.out.println("Peek: " + pQueue.peek());
		System.out.println("Poll: " + pQueue.poll());
		System.out.println(pQueue);
		System.out.println("Remove 0 : " + pQueue.remove(0));
		System.out.println(pQueue);
		System.out.println("Remove: " + pQueue.remove());
		System.out.println(pQueue);
		
		
		System.out.println("----------------------------------");
		
		for(int i: pQueue)
			System.out.print(i + "\t");

	}
}