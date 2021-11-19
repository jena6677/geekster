package com.geekster.dsa;
import java.util.Scanner;

class Node
{
	int data;
	int min;
	Node(){};
	Node(int data, int minSoFar)
	{
		this.data = data;
		this.min = minSoFar;
	}
	
}
public class MyStack {
	static int top = 0;
	static int current = 0;
	static int max = 10;
	static int minSoFar = Integer.MAX_VALUE;
	public static void main(String[] args) {
		
		Node[] arr = new Node[10];
		
		push(new Node(1, minSoFar),arr);
		push(new Node(0, minSoFar),arr);
		push(new Node(4, minSoFar),arr);
		push(new Node(-1, minSoFar),arr);
		pop(arr);
		System.out.println(min(arr));
		
		
	}
	static void push(Node n, Node[] arr)
	{
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
}
