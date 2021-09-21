package com.geekster;

public class ReplaceValue 
{
	public static void main(String[] args) 
	{
		int arr[] = {12,34,56,78,90,76,78,97};
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == 76)
			{
				arr[i] = 0;
			}
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
