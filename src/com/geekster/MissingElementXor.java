package com.geekster;

public class MissingElementXor 
{
	public static void main(String[] args) 
	{
		int sum1 = 0, sum2 = 0;
		int arr[] = {0,1,4,3,2};
		for(int i = 0; i <= arr.length; i++)
		{
			sum1 = sum1^i;
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			sum2 = sum2^arr[i];
		}
		System.out.println(sum1^sum2);
	}
}
