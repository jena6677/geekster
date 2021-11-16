package com.geekster.dsa;

public class Fibonancy {
	
	public static void main(String[] args) {
		
		fibo(0,1,10);
	}
	static void fibo(int prev, int current, int bound)
	{
		if(current >= bound)
		{
			return;
		}
		if(prev+current < bound)
		{
			System.out.println(prev+current);
		}
		fibo(current,prev+current, bound);
	}
}
