package com.geekster;

public class FindTwoNonRepeatingBitwise {

	public static void main(String[] args) {
		int ans1 = 0, ans2 = 0;
		int sum = 0; 
		int arr[] = {1,5,3,6,2,1,6,2};
		for(int i = 0; i < arr.length; i++)
		{
			sum ^= arr[i];
		}
		int mask = sum & (~(sum-1));
		for(int i = 0; i < arr.length; i++)
		{
			if((arr[i]&mask) == 0)
			{
				ans1 = ans1^arr[i];
			}
			else
			{
				ans2 = ans2 ^ arr[i];
			}
		}
		System.out.println(ans1);
		System.out.println(ans2);
	}
}
