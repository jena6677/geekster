package com.geekster.dsa;
import java.util.*;
class Node3
{
	int data;
	Node3 left,right;
	
	public Node3(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class TreePreOrder {
	static int levelSoFar = 0;
	public static void main(String[] args) {
		
		Node3 n1 = new Node3(1);                 //1
										        //2 3
		n1.left = new Node3(2);				   //4   6
		n1.right = new Node3(3);			  //5 7
		n1.right.right = new Node3(6);
		n1.left.left = new Node3(4);
		n1.left.left.right = new Node3(7);
		n1.left.left.left = new Node3(5);
		//levelOrder(n1);
		//printlevel(n1,1);
		//System.out.println(maxHeight(n1));
		//leftView(n1,0);
		printLeaf(n1);
		//System.out.println(sumNodes(n1));
		//levelOrderRecurssive(n1);
		//printRight(n1,0);
		//System.out.println(countNode(n1));
		//System.out.println(maxDepth(n1));
		//preOrder(n1);
		//postOrder(n1);
		//inOrder(n1);
	}
	static int printLeaf(Node3 head)
	{

		if(head == null) return 0;
		
		if(printLeaf(head.left)+printLeaf(head.right) == 0)
		{
			System.out.print(head.data+", ");
		}
		
		return 1;
		
	}
	static int maxHeight(Node3 head)
	{
		return maxDepth(head);
	}
	static int sumNodes(Node3 head)
	{
		if(head == null) return 0;
		
		return 1+sumNodes(head.left)+sumNodes(head.right);
	}
	static void printRight(Node3 head, int currentLevel)
	{
		if(head == null) return;
		
		if(currentLevel >= levelSoFar)
		{
			System.out.print(head.data+", ");
			levelSoFar++;
		}
		
		printRight(head.right, currentLevel+1);
		printRight(head.left, currentLevel+1);		
	}
	static void preOrder(Node3 head)
	{
		if(head == null) return;
		System.out.print(head.data+", ");
		preOrder(head.left);
		preOrder(head.right);
	}
	static void postOrder(Node3 head)
	{
		if(head == null) return;
		
		postOrder(head.left);
		postOrder(head.right);
		System.out.print(head.data+", ");
	}
	static void inOrder(Node3 head)
	{
		if(head == null) return;
		
		inOrder(head.left);
		System.out.print(head.data+", ");
		inOrder(head.right);
		
	}
	static int maxDepth(Node3 head)
	{
		if(head == null)  return -1;
		
		int height1 = maxDepth(head.left);
		int height2 = maxDepth(head.right);
		
		if(height1 > height2)
		{
			return(height1 + 1);
		}
		return height2+1;
	}
	static int countNode(Node3 head)
	{
		if(head == null) return 0;
		else return 1+countNode(head.left)+countNode(head.right);
	}
	static void levelOrder(Node3 head)
	{
		if(head == null) return;
		Queue<Node3> q = new LinkedList<>();
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
	static void leftView(Node3 head, int currentlevel)
	{
		if(head == null)
		{
			return;
		}
		
		if(currentlevel >= levelSoFar)
		{
			System.out.print(head.data);
			levelSoFar++;
		}
		
		leftView(head.left, currentlevel+1);
		leftView(head.right, currentlevel+1);
	}
	static void printlevel(Node3 head, int level)
	{
		if(head == null) return;
		
		if(level == 0)
		{
			System.out.print(head.data);
		}
		
		printlevel(head.left, level-1);
		printlevel(head.right, level-1);
	}
	static void levelOrderRecurssive(Node3 head)
	{
		int height = maxDepth(head);
		for(int i = 0; i <= height; i++)
		{
			printlevel(head, i);
		}
	}
}
