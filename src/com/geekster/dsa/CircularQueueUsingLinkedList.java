package com.geekster.dsa;

class Nodes
{
	int data;
	Nodes next;
	
	public Nodes(int n)
	{
		this.data = n;
		this.next = null;
	}

}
public class CircularQueueUsingLinkedList {
	static Nodes n1 = new Nodes(0);
	static Nodes n2 = new Nodes(0);
	static Nodes n3 = new Nodes(0);
	static Nodes n4 = new Nodes(0);
	static Nodes n5 = new Nodes(0);
	static Nodes start;
	static Nodes end;
	public static void main(String[] args) {
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n1;
		
		start = end = null;
		
		enQueue(1);
		enQueue(2);
		System.out.println(top());
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(isFull());
		System.out.println(isEmpty());
		
	}
	static boolean isEmpty()
	{
		if(start == null)
		{
			return true;
		}
		return false;
	}
	static boolean isFull()
	{
		if(end != null)
		{
			if(end.next == start)
			{
				return true;
			}
			return false;
		}
		return false;
	}
	static void enQueue(int n)
	{
		if(isFull())
		{
			System.out.println("no space left");
			return;
		}
		if(start == null)
		{
			start = n1;
			end = n1;
			end.data = n;
		}
		else
		{
			end = end.next;
			end.data = n;
		}
	}
	static int deQueue()
	{
		if(isEmpty())
		{
			System.out.println("no element present");
			return -1;
		}
		int result = start.data;
		if(start == end)
		{
			start = end = null;
		}
		else
		{
			start = start.next;
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
		return start.data;
	}
}
