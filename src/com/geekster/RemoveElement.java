package com.geekster;

public class RemoveElement {

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,5,7};
		int arr2[] = new int[4];
		int k = 5;
		int j = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i]== k)
			{
				continue;
			}
			else
			{
				arr2[j] = arr[i];
				++j;
			}
		}
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.print(arr2[i]+" ");
		}
	}
}
