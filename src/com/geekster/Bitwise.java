package com.geekster;

public class Bitwise {

	public static void main(String[] args) {
		
		int x = 5, y = 9;
		if((x&y) >10 && (x&y) < 20)
		{
			System.out.println("above 10 below 20");
		}
		else
		{
			System.out.println(x&y);
		}
		
		if((x|y) >10 && (x|y) < 20)
		{
			System.out.println(x|y);
		}
	}
}
