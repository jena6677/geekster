package com.geekster.dsa;

public class FirstAndLastOccurance {

public static void main(String[] args) {
		
		int arr[] = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
		int target = 6;
		System.out.println("first occurance : "+firstOccurance(arr, target));
		System.out.println("last occcurance : "+lastOccurance(arr, target));

	}
	
	public static int firstOccurance(int arr[], int t)
	{
		int min = 0, max = arr.length - 1;
		while(min <= max)
		{
			int mid = min+(max-min)/2;
			if(arr[mid] == t)
			{
				int m = mid,n = mid;
				while(arr[m] == t )
				{
					m-=1;
					if(m < 0)
					{
						break;
					}
				}
				while(arr[n] == t)
				{
					n+=1;
					if(n >= arr.length)
					{
						break;
					}
				}
				return m+1;
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
		return -1;
	}
	public static int lastOccurance(int arr[], int t)
	{
		int min = 0, max = arr.length - 1;
		while(min <= max)
		{
			int mid = min+(max-min)/2;
			if(arr[mid] == t)
			{
				int m = mid,n = mid;
				while(arr[m] == t )
				{
					m-=1;
					if(m < 0)
					{
						break;
					}
				}
				while(arr[n] == t)
				{
					n+=1;
					if(n >= arr.length)
					{
						break;
					}
				}
				return n-1;
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
		return -1;
	}
}
