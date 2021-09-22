package com.geekster;
import java.util.Scanner;
public class CapitalConveter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		capitalConveter(s);
		sc.close();
	}
	public static void capitalConveter(String s)
	{
		String stri = "";
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			int nt = c;
			if(nt >= 97 && nt <= 122)
			{
				int k = c;
				char ch = (char) (k - 32);
				stri+=ch;
			}
			else
			{
				stri+=c;
			}
		}
		System.out.println(stri);
	}
}
