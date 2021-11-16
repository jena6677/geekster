package com.geekster.dsa;
import java.util.*;
public class Alist {

	public static void main(String[] args) {
		int[] arr1 = {1,2,2,3};
		int[] arr2 = {3,2,4,5,3,4};
		Arrays.sort(arr2);
		List<Integer> list = new ArrayList<>();
	
		for(int i = 0; i < arr1.length; i++)
		{
			if(bsa(arr2, arr1[i]))
			{
				list.add(arr1[i]);
			}
		}
		
		
		
		for(int s : list)
		{
			System.out.println(s);
		}
	}
	public static boolean bsa(int[] arr, int t)
	{
		int min = 0, max = arr.length - 1;
		while(min <= max)
		{
			int mid = min+(max-min)/2;
			if(arr[mid] == t)
			{
				return true;
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
		return false;
	}
}
