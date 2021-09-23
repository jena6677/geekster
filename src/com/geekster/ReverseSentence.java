package com.geekster;
import java.util.Scanner;
public class ReverseSentence 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(reverse(sc.nextLine()));
		sc.close();
	}
	public static String reverse(String s)
	{
		String k = "";
		String str[] = s.split(" ");
		for(int i = 0; i < str.length; i++)
		{
			k+= str[(str.length - 1)-i]+" ";
		}
		return k;
	}
}
