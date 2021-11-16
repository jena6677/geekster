package com.geekster;
import java.util.Scanner;
public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			fizzBuzz(i);
		}
	}
	public static void fizzBuzz(int n)
	{
		if(n % 3 == 0)
		{
			if(n % 5 == 0)
			{
				System.out.println("FizzBuzz");
			}
			else
			{
				System.out.println("Fizz");
			}
		}
		else if(n % 5 == 0)
		{
			System.out.println("Buzz");
		}
		else
		{
			System.out.println(n);
		}
	}
}
