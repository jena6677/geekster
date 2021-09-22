package com.geekster;

public class PrimeRange 
{
	public static void main(String[] args) 
	{
		for(int i = 15; i <=80; i++)
		{
			isPrime(i);
		}
	}
	public static void isPrime(int n)
	{
		if(n == 0 || n == 1)
		{
			return;
		}
		else
		{
			for(int i = 2; i < n/2; i++)
			{
				if(n%i == 0)
				{
					return;
				}
			}
			System.out.print(n+" ");
			return;
		}
	}
}
