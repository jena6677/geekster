package com.geekster.dsa;

public class Sealing {

	public static void main(String[] args) {
		
		int arr[] = {3,5,6,9,11,13,15};
		int target = 3;
		System.out.println(sealing(arr, target));
	}
	public static int sealing(int[] arr, int t)
	{
		int min = 0, max = arr.length - 1;
		while(min <= max)
		{
			int left =0, right =0;
			int mid = min+(max-min)/2;
			if(arr[mid] == t)
			{
				if(mid + 1 >= arr.length)
				{
					return -1;
				}
				while(arr[mid] == arr[mid+1])
				{
					mid += 1;
					if(mid >= arr.length)
					{
						return -1;
					}
				}
				return arr[mid+1];
			}
			else if(t < arr[mid])
			{
				max = mid-1;
			}
			else if(t > arr[mid])
			{
				min = mid+1;
			}
		}
		if(min >= arr.length)
		{
			return -1;
		}
		else if(max < 0)
		{
			return -1;
		}
		return arr[min];
	}
}
