package com.geekster.dsa;

public class CheckSorted {

	public static void main(String[] args) {
		
		int arr[] = {1,2,1,3,4,5,4};
		
		check(arr,0,1);
	}
	static void check(int[] arr, int first, int second)
	{
		if(first == arr.length-1)
		{
			System.out.println("true");
			return;
		}
		if(arr[first] > arr[second])
		{
			System.out.println("false");
			return;
		}
		check(arr, ++first, ++second);
		
	}
}
