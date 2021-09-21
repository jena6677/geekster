package com.geekster;

public class MaxMin {
	public static void main(String[] args) 
	{
		int arr[] = {3,6,45,78,65,78,9,87,36};
		int min = arr[0];
		int max = arr[0];
		for(int i = 0; i < arr.length;i++)
		{
			if(arr[i]> max)
			{
				max = arr[i];
			}
			if(arr[i] < arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println("min : "+min);
		System.out.println("max : "+max);
	}
}
