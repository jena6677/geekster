package com.geekster;
import java.util.Scanner;
public class AlphaNumeric {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string to check weather it is alpha numeric or not : ");
		String s = sc.next();
		checkAlphaNum(s);
		sc.close();
	}
	public static void checkAlphaNum(String s)
	{
		int l = 0;
		boolean b = false;
		for(int i = 0; i < s.length(); i++)
		{
			int c = s.charAt(i);
			if((c >= 48 && c <= 57) || (c >= 97 && c <= 122) || (c >= 65 && c <= 90))
			{
				l++;
			}
		}
		if(l == s.length())
		{
			b = true;
		}
		if(b == true)
		{
			System.out.println("The string is alpha numeric");
		}
		else
		{
			System.out.println("The string is not alpha numeric");
		}		
	}
}
