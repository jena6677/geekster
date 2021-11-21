package com.geekster.dsa;

class Node
{
	int data;
	int min;
	int max;
	int avg;
	Node(){};
	Node(int data, int minSoFar, int maxSoFar, int avgSoFar)
	{
		this.data = data;
		this.min = minSoFar;
		this.max = maxSoFar;
		this.avg = avgSoFar;
	}
	
}
public class MyStack {
	static int top = 0;
	static int current = 0;
	static int max = 10;
	static int count = 0;
	static int avgSoFar = 0;
	static int maxSoFar = Integer.MIN_VALUE;
	static int minSoFar = Integer.MAX_VALUE;
	public static void main(String[] args) {
		
		Node[] arr = new Node[10];
		
		push(new Node(1, minSoFar, maxSoFar, avgSoFar),arr);
		push(new Node(0, minSoFar, maxSoFar, avgSoFar),arr);
		push(new Node(4, minSoFar, maxSoFar, avgSoFar),arr);
		push(new Node(-1, minSoFar, maxSoFar, avgSoFar),arr);
		System.out.println(pop(arr).data);
		push(new Node(5, minSoFar, maxSoFar, avgSoFar),arr);
		
		System.out.println(min(arr));
		System.out.println(max(arr));
		System.out.println(avg(arr));
		System.out.println(peek(arr).data);
		
	}
	static void push(Node n, Node[] arr)
	{
		count++;
		if(top == max)
		{
			System.out.println("overflow");
			return;
		}
		if(n.data < minSoFar)
		{
			n.min = n.data;
			minSoFar = n.data;
		}
		if(n.data > maxSoFar)
		{
			n.max = n.data;
			maxSoFar = n.data;
		}
		n.avg = (n.data+avgSoFar)/count;
		avgSoFar += n.data;
		arr[top] = n;
		current = top;
		top++;
	}
	static Node pop(Node[] arr)
	{
		if(top == 0)
		{
			System.out.println("stack have no elements");
		}
		Node n = arr[current];
		top--;
		current--;
		count--;
		minSoFar = peek(arr).min;
		return n; 
	}
	static Node peek(Node[] arr)
	{
		if(top == 0)
		{
			System.out.println("stack have no elements");
		}
		return arr[current];
	}
	static int min(Node[] arr)
	{
		Node n1 = peek(arr);
		return n1.min;
	}
	static int max(Node[] arr)
	{
		Node n1 = peek(arr);
		return n1.max;
	}
	static int avg(Node[] arr)
	{
		return peek(arr).avg;
	}
}
