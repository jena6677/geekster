package com.geekster.dsa;

public class RecurssionFactorial {

	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(fact(n));
		
	}
	static int fact(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		return n*fact(n-1);
	}
}