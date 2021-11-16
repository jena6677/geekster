package com.geekster.dsa;

import java.util.Arrays;

public class ArrayRotate {

	public static void main(String[] args) {
		
		int[] arr = {15,16,18,19,1,2,3,4,5,6,10};
		int min = min(arr);
		System.out.println(min);
		System.out.println(bsa(arr,min));
	}
	public static int min(int arr[])
	{
		int arr2[] = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			arr2[i] = arr[i];
		}
		Arrays.sort(arr2);
		return arr2[0];
	}
	public static int bsa(int arr[], int t)
	{
		int min = 0, max = arr.length - 1;
        while(min <= max)
        {
            int mid = min+(max-min)/2;
            if(arr[mid] == t)
            {
                return mid;
            }
            else if(arr[min] <= arr[mid])
            {
                min = mid+1;
            }
            else if(arr[max] >= arr[mid])
            {
                max = mid-               1;
            }
        }
        return -1;
	}
}
