package com.geekster.dsa;

public class SortingZeroOneTwo {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,1,2,0,0,1,2};
		
		int start = 0;
		int end = arr.length-1;
		int mid = arr.length-1;
		while(start < end && mid > start)
		{
			if(arr[start] == 0)
			{
				start++;
			}
			else if(arr[start] == 1)
			{
				if(arr[end] == 2)
				{
					end--;
					mid--;
				}
				else if(arr[end] == 0)
				{
					int temp = arr[end];
					arr[end] = arr[start];
					arr[start] = temp;
					start++;
				}
				else if(arr[end] == 1)
				{
					if(arr[mid] == 2)
					{
						int temp = arr[end];
						arr[end] = arr[mid];
						arr[mid] = temp;
						end--;
					}
					if(arr[mid] == 1)
					{
						mid--;
					}
					if(arr[mid] == 0)
					{
						int temp = arr[mid];
						arr[mid] = arr[start];
						arr[start] = temp;
						start++;
					}
				}
			}
			else if(arr[start] == 2)
			{
				if(arr[end] == 0)
				{
					int temp = arr[end];
					arr[end] = arr[start];
					arr[start] = temp;
					start++;
				}
				else if(arr[end] == 1)
				{
					int temp = arr[end];
					arr[end] = arr[start];
					arr[start] = temp;
					end--;
				}
				else if(arr[end] == 2)
				{
					end--;
				}
			}
		}
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
}
