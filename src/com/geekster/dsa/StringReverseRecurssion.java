package com.geekster.dsa;

public class StringReverseRecurssion {

	public static void main(String[] args) {
		
		String s = "asutosh";
		printt(s,s.length()-1);
		
	}
	static void printt(String s, int pointer)
	{
		if(pointer < 0)
		{
			return;
		}
		System.out.print(s.charAt(pointer));
		printt(s,--pointer);
		
	}
}
