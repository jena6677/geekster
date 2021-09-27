package com.patterns;
import java.util.Scanner;
public class SnadGlass 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = n;
		n = n*2;
		for(int i = 1; i <= n; i++)
		{
			if(i > x)
			{
				for(int k = 0; k < x*2-i; k++)
				{
					System.out.print(" ");
				}
				for(int j = 1; j <= i-x; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			else
			{
				for(int k = 1; k < i; k++)
				{
					System.out.print(" ");
				}
				for(int j = 1; j <= x-i+1; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			
		}
	}
}
