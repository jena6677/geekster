package com.geekster;
import java.util.Scanner;
public class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a : ");
		int a = sc.nextInt();
		System.out.println("enter the value of b : ");
		int b = sc.nextInt();
		System.out.println("sum of a and b : "+ sum(a,b));
		System.out.println("mult of a and b is : "+ mult(a,b));
	}
	static int sum(int a, int b)
	{
		return a+b;
	}
	static int mult(int a, int b)
	{
		return a*b;
	}
}
