package com.geekster;

public class FindTwoNonRepeatingBitwise {

	public static void main(String[] args) {
		
		int arr[] = {1,5,8,6,5,1,6,2};
		int arr2[] = {1,2,4,8};
		int start = 0, end = 3;
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum ^= arr[i];
		}
		while(end > start)
		{
			if(arr2[start] + arr2[end] == sum)
			{
				System.out.println(arr2[start] +" "+arr2[end]);
				break;
			}
			else if(arr2[start] + arr2[end] < sum)
			{
				start++;
			}
			else if(arr2[start] + arr2[end] > sum)
			{
				end--;
			}
		}
	}
}
