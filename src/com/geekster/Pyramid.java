package com.geekster;
import java.util.Scanner;
public class Pyramid 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the height of the pyramid : ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < (n*2)-1; j++)
			{
				if(j == ((n*2)-1)/2 ||( j >= (((n*2)-1)/2)-i && j <= (((n*2)-1)/2)+i))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
