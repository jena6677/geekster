package com.geekster;

public class FindMissing 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,6,7,8,9,11,12,13};
		for(int i = 0; i < arr.length; i++)
		{
			if(i == arr[i]-1)
			{
				continue;
			}
			else
			{
				System.out.println("the missing element is : "+(i+1));
				break;
			}
		}
	}
}
