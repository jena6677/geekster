package com.geekster;
import java.util.Scanner;
public class Pyramid2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the hight of the pyramid : ");
		int n = sc.nextInt();
		sc.close();
		for(int i = 1; i <= n; i++)
		{
			int space = n-i;
			for(int s = 1; s <= space; s++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
