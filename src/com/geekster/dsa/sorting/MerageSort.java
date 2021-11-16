package com.geekster.dsa.sorting;
import java.util.*;
public class MerageSort {

	public static void main(String[] args) {
		
		int[] arr = {2,4,6,8,1,3,7,9};
		sort(arr, 0, arr.length-1);
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		
	}
	public static void sort(int[] arr, int start, int end)
	{
		if(start < end)
		{
			int mid = start+(end-start)/2;
			
			sort(arr, start, mid);
			sort(arr, mid+1, end);
			
			merge(arr,start,mid,end);
		}
	}
	public static void merge(int[] arr, int start, int mid, int end) //2436
	{
		int n1 = mid-start+1;
		int n2 = end-mid;
		
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];
		
		for(int i = 0; i < n1; i++)
		{
			arr1[i] = arr[start+i];;
		}
		for(int j = 0; j < n2; j++)
		{
			arr2[j] = arr[mid+1+j];
		}
		
		int i = 0, j = 0;
		
		int k = start;
		while(i < n1 && j < n2)
		{
			if(arr1[i] < arr2[j])
			{
				arr[k] = arr1[i];
				i++;
			}
			else
			{
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i < n1)
		{
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while(j < n2)
		{
			arr[k] = arr2[j];
			j++;
			k++;
		}	
	}
}
