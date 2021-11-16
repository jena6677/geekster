package com.geekster.dsa;

public class Recurssion {
	int k = 1;
	public static void main(String[] args) {
		
		int n = 5;
		printt(n);
	}
	public static void printt(int n)
	{
		if(n == 0)
		{
			return;
		}
		printt(--n);
		System.out.println(n);
		
	}
}
