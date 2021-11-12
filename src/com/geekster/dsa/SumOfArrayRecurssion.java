package com.geekster.dsa;

public class SumOfArrayRecurssion {
	static int sum = 0;
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		System.out.println(sum(arr, arr.length-1));
	}
	static int sum(int[] arr, int size)
	{
		if(size < 0)
		{
			return 0;
		}
		sum = arr[size]+sum(arr, --size);
		return sum;
	}
}
