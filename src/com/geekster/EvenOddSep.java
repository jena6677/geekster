package com.geekster;

public class EvenOddSep {

	public static void main(String[] args) {
		
		int arr[] = {12,14,19,23,4,7,9,10};
		int arr2[] = new int[arr.length];
		int j = 0;
		int k = arr.length-1;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i]%2 == 0)
			{
				arr2[j] = arr[i];
				++j;
			}
			
			if(arr[i]%2 != 0)
			{
				arr2[k] = arr[i];
				--k;
			}
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}
}
