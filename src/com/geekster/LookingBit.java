package com.geekster;
import java.util.Scanner;
public class LookingBit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 32;
		int place = sc.nextInt();
		int mask = 1;
		for(int i = 1; i < place; i++)
		{
			mask = mask * 2;
		}
		if((n & mask) == mask)
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
	}
}
