package com.geekster;

public class MethodOverloading 
{
	
	static void sum(int x, int y)
	{
		int s1 = x+y;
		System.out.println("sum = "+s1);
	}
	
	static void sum(int x, int y, int z)
	{
		int s2 = x+y+z;
		System.out.println("sum = "+s2);
	}
	
	static void sum(double x, double y)
	{
		double s3 = x+y;
		System.out.println("sum ="+s3);
	}
}
