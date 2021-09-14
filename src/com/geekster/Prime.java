package com.geekster;
import java.util.Scanner;
public class Prime 
{
	public static void main(String[] args) 
	{
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int n = (int)sc.nextInt();
		if(n == 0 || n == 1)
		{
			System.out.println("not a prime number");
		}
		else
		{
			for(int i = 2; i < n/2; i++)
			{
				if(n%i == 0)
				{
					System.out.println("not a prime number");
					flag = true;
					break;
				}
			}
			if(flag == false)
			{
				System.out.println("its a prime number");
			}
		}
		sc.close();
	}
}
