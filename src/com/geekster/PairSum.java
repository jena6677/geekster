package com.geekster;

public class PairSum 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5};
		int target = 9;
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(target == arr[i]+arr[j])
				{
					System.out.println("the pair found is : "+ arr[i]+" "+arr[j]);
					break;
				}
			}
		}
	}
}
