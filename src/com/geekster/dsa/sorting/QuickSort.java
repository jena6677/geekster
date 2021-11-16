package com.geekster.dsa.sorting;
import java.util.*;
public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = {1,3,2,4,5,6,8,7,1,9};
		
		int l = 0;
		int r = arr.length-1;
		
		qs(arr, l, r);
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
	static void qs(int[] arr, int l, int r)
	{
		if(l >= r)
		{
			return;
		}
		
		int mid = partition(arr, l, r);
		qs(arr,l,mid-1);
		qs(arr,mid+1,r);
	}
	static int partition(int[] arr, int l, int r)
	{
		int pivot = arr[r];
		int i = l-1;
		int j = l;
		while(j < r)
		{
			if(arr[j] < pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			j++;
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return i;
	}
}
