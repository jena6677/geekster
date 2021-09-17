package com.geekster;

import java.util.Scanner;

public class CheckPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String k = "";
		System.out.println("enter the string : ");
		String s = sc.nextLine();
		for(int i = 0; i < s.length(); i++)
		{
			k+=s.charAt((s.length()-1)-i);
		}
		if(k.equals(s))
		{
			System.out.println("1st way : the string is palindrome");
		}
		else
		{
			System.out.println("1st way : the string is not palindrome");
		}
		cp(s);
		sc.close();
	}
	public static void cp(String s) // 2nd way
	{
		int count = 0;
		int i = 0, j = s.length()-1;
		while(i < j)
		{
			if(s.charAt(i) == s.charAt(j))
			{
				count++;
				i++;
				j--;
			}
			else
			{
				break;
			}
			
		}
		if(count == s.length()/2)
		{
			System.out.println("1st way : the string is palindrome");
		}
		else
		{
			System.out.println("2nd way : the string is not palindrome");
		}
	}
}
