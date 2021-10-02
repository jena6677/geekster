package com.geekster;

public class EvenOddBitwise {

	public static void main(String[] args) {
		
		int n = 93;
		
		int k = 1;
		
		if((n&k) == k )
		{
			System.out.println("odd");
		}
		else
		{
			System.out.println("even");
		}
	}
}
