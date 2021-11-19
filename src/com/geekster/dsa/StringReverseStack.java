package com.geekster.dsa;
import java.util.*;
public class StringReverseStack {

	public static void main(String[] args) {
		
		Stack<Character> stk = new Stack<>();
		
		String s = "asutosh";
		
		for(int i = 0; i < s.length(); i++)
		{
			stk.push(s.charAt(i));
		}
		while(!stk.isEmpty())
		{
			System.out.print(stk.pop()+" ");
		}
	}
}
