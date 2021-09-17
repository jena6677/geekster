package com.geekster;

import java.util.Scanner;

public class IntegerReverse 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = n;
		while(n > 0)
		{
			sum = (sum*10)+ n%10;
			n = n/10;
		}
		System.out.println("first way : "+sum);
		reverse(x);
		sc.close();
	}
	public static void reverse(int x) //2nd way
	{
		String s = "";
		while(x>0)
		{
			s += (char)x%10;
			x = x/10;
		}
		System.out.println("second way : " + s);
	}
}
