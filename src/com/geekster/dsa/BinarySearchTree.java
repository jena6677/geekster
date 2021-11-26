package com.geekster.dsa;

import java.util.LinkedList;
import java.util.Queue;

class Node4
{
	int data;
	Node4 left, right;
	
	Node4(){}
	
	Node4(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class BinarySearchTree {

	public static void main(String[] args) {
		
		int[] arr = {23,21,34,54,65,20,19,45,98,22};
		Node4 head = makeBST(arr);  
		
		//System.out.println(getMax(head));
		//levelOrder(head);
		preOrder(head);
		System.out.println();
		head = deleteNode(54,head);
		preOrder(head);
		System.out.println();
		System.out.println(head.left.right.data);
		//levelOrder(head);
	}
	static Node4 deleteNode(int data, Node4 head)
	{
		if(data < head.data)
		{
			head.left = deleteNode(data, head.left);
		}
		else if(data > head.data)
		{
			head.right = deleteNode(data, head.right);
		}
		else
		{
			if(head.left != null && head.right != null)
			{
				head.data = getMax(head.left);
				head.left = deleteNode(head.data, head.left);
				return head;
			}
			else if(head.left != null)
			{
				return head.left;
			}
			else if(head.right != null)
			{
				return head.right;
			}
			else
			{
				return null;
			}
		}
		return head;
	}
	static int getMax(Node4 head)
	{
		if(head.right == null) return head.data;
		return getMax(head.right);
	}
	static void preOrder(Node4 head)
	{
		if(head == null) return;
		
		System.out.print(head.data+" ");
		preOrder(head.left);
		preOrder(head.right);
	}
	static void levelOrder(Node4 head)
	{
		if(head == null) return;
		Queue<Node4> q = new LinkedList<>();
		q.add(head);
		while(!q.isEmpty())
		{
			System.out.print(q.peek().data+", ");
			if(q.peek().left != null)
			{
				q.add(q.peek().left);
			}
			if(q.peek().right != null)
			{
				q.add(q.peek().right);
			}
			q.poll();
		}
	}
	static Node4 makeBST(int[] arr)
	{
		Node4 head = new Node4(arr[0]);
		Node4 n1;
		for(int i = 1; i < arr.length; i++)
		{
			n1 = head;
			while(n1 != null)
			{
				if(arr[i] < n1.data)
				{
					if(n1.left == null)
					{
						n1.left = new Node4(arr[i]);
						break;
					}
					else
					{
						n1 = n1.left;
					}
				}
				else
				{
					if(n1.right == null)
					{
						n1.right = new Node4(arr[i]);
						break;
					}
					else
					{
						n1 = n1.right;
					}
				}
			}
		}
		return head;
	}
}
