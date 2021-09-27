package com.geekster;
import java.util.Scanner;
public class AgeValidation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the age : ");
		int p1Age = sc.nextInt();
		if(validateAge(p1Age))
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("not eligible");
		}
	}
	static boolean validateAge(int p1Age)
	{
		if(p1Age >= 18)
		{
			return true;
		}
		return false;
	}
}
