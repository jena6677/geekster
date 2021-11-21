package com.geekster.dsa;

public class CircularQueueUsingArray {
	
	static int[] arr;
	static int start,end;
	public static void main(String[] args) {
		arr = new int[10];
		start = end = -1;
		
		enQueue(1);
		enQueue(2);
		enQueue(3);
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
		enQueue(1);
		System.out.println(top());
	}
	static boolean isEmpty()
	{
		if(start == -1)
		{
			return true;
		}
		return false;
	}
	static boolean isFull()
	{
		if((end+1)%10 == start)
		{
			return true;
		}
		return false;
	}
	static void enQueue(int n)
	{
		if(isFull())
		{
			System.out.println("queue is full");
			return; 
		}
		if(start == -1) start = 0;
		end = (end+1)%10;
		arr[end] = n;
	}
	static int deQueue()
	{
		if(isEmpty())
		{
			System.out.println("queue have no elements");
			return -1;
		}
		int result = arr[start];
		if(start == end)
		{
			start = end = -1;
		}
		else
		{
			start = (start+1)%10;
		}
		return result;
	}
	static int top()
	{
		if(isEmpty())
		{
			System.out.println("no element present");
			return -1;
		}
		return arr[start];
	}
}
