package com.geekster.dsa;

public class NumberFrequency {
	
	public static void main(String[] args) {
		
		int arr[] = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
		int target = 6;
		System.out.println(frequency(arr, target));
	}
	
	public static int frequency(int arr[], int t)
	{
		int min = 0, max = arr.length - 1;
		while(min <= max)
		{
			int left =0, right =0;
			int mid = min+(max-min)/2;
			if(arr[mid] == t)
			{
				int m = mid,n = mid;
				while(arr[m] == t )
				{
					left++;
					m-=1;
					if(m < 0)
					{
						break;
					}
				}
				while(arr[n] == t)
				{
					right++;
					n+=1;
					if(n >= arr.length)
					{
						break;
					}
				}
				return left+right-1;
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
