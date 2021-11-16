package com.geekster.dsa.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {2,6,8,5,4,3};
		boolean flag = false;
		for(int i = 0; i < arr.length-(i+1); i++)
		{
			for(int j = 0; j < arr.length-(i+1); j++)
			{
				if(arr[j] > arr[j+1])
				{
					swap(arr,j,j+1);
					flag = true;
				}
			}
			if(flag == false)
			{
				break;
			}
		}
		printArray(arr);
	}
	public static void swap(int[] arr, int x, int y)
	{
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	public static void printArray(int[] arr)
	{
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
}
