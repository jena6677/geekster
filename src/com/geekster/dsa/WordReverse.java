package com.geekster.dsa;

import java.util.Stack;

public class WordReverse {

	public static void main(String[] args) {
		
		Stack<String> stk = new Stack<>();
		String s = "hii i am a good boy";
		
		String[] arr = s.split(" ");
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(reverse(arr[i])+" ");
		}
		
	}
	static String reverse(String s)
	{
		Stack<Character> stk = new Stack<>();
		String str = "";
		for(int i = 0; i < s.length(); i++)
		{
			stk.push(s.charAt(i));
		}
		while(!stk.isEmpty())
		{
			str+=stk.pop();
		}
		return str;
	}
}
