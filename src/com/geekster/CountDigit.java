package com.geekster;
import java.util.Scanner;
public class CountDigit 
{
	public static void main(String[] args) 
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		while(n > 0)
		{
			count++;
			n = n/10;
		}
		System.out.println("the number of digit present inthe number is : "+count);
		sc.close();
	}
}
