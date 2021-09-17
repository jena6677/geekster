package com.geekster;

import java.util.Scanner;

public class CharCounter 
{
	public static void main(String[] args) 
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s+"3";
		int i = 0;
		while(s.charAt(i) != '3')
		{
			count++;
			i++;
		}
		if (count > 4)
		{
			System.out.println("bigger");
		}
		else
		{
			System.out.println("smaller");
		}
		sc.close();
	}
}
