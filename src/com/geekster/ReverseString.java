package com.geekster;
import java.util.Scanner;
public class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String str[] = s.split(" ");
		String st = "";
		for(int i = 0; i < str.length; i++)
		{
			st = st + reverse(str[i]) + " ";
		}
		System.out.println(st);
		sc.close();              
	}
	public static String reverse(String s)
	{
		String k = "";
		for(int i = 0; i < s.length(); i++)
		{
			k+=s.charAt((s.length()-1)-i);
		}
		return k;
	}
}
