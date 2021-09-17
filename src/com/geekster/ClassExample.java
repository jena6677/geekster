package com.geekster;
import java.util.Scanner;
public class ClassExample 
{
	public static void main(String[] args) 
	{
		b ad = new b();
		b.add2();
		ad.add();
	}
}
class b
{
	static Scanner sc = new Scanner(System.in);
	 public void add()
	 {
		 System.out.println(" enter the first number");
		 int x = sc.nextInt();
		 System.out.println("enter the second number");
		 int y = sc.nextInt();
		 int sum = x+y;
		 System.out.println("the sum of two numbers is : "+sum);
	 }
	 public static void add2()
	 {
		 System.out.println(" enter the first number");
		 int x = sc.nextInt();
		 System.out.println("enter the second number");
		 int y = sc.nextInt();
		 int sum = x+y;
		 System.out.println("the sum of two numbers is : "+sum);
	 }
}
