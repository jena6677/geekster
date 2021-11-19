package com.geekster.dsa;

import java.util.Stack;

public class StringReverseStack2 {

	public static void main(String[] args) {
		
		Stack<String> stk = new Stack<>();
		
		String s = "hii i am a good boy";
		
		String[] arr = s.split(" ");
		
		for(int i = 0; i < arr.length; i++)
		{
			stk.push(arr[i]);
		}
		while(!stk.isEmpty())
		{
			System.out.print(stk.pop()+" ");
		}
	}
}
