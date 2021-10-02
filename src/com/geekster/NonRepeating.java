package com.geekster;

public class NonRepeating 
{
	public static void main(String[] args) 
	{
		int a = 0;
		int arr[] = {4,6,6,4,2,3,3};
		for(int i = 0; i < arr.length; i++)
		{
			a = a^arr[i];
		}
		System.out.println(a);
	}
}
