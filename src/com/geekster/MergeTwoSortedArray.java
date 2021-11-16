package com.geekster;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,9,0,0,0};
		int arr2[] = {4,5,6};
		int temp = 0;
		for(int i = 0; i < arr2.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if(arr2[i] < arr[j] || arr[j] == 0)
				{
					temp = arr2[i];
					arr2[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < arr2.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[j] == 0)
				{
					arr[j] = arr2[i];
					break;
				}
			}
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}