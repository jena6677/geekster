package com.geekster;

public class MergeSortedArray {

	public static void main(String[] args) {
		
		int arr[] = {4,5,6,7,8};
		int arr2[] = {1,2,3,4};
		int len = arr.length;
		int arr3[] = new int[arr.length+arr2.length];
		for(int i = 0; i < arr2.length; i++)
		{
			arr3[i] = arr2[i];
		}
		for(int i = arr2.length; i < arr3.length; i++)
		{
		
			arr3[i] = arr[i-4];
		}
		for(int i = 0; i < arr3.length; i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}
}
