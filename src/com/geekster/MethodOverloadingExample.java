package com.geekster;

public class MethodOverloadingExample 
{
	public static void main(String[] args) 
	{
		MethodOverloading mo = new MethodOverloading();
		mo.sum(2, 3);
		mo.sum(3, 4, 5);
		mo.sum(2.3, 4.6);
	}
}
