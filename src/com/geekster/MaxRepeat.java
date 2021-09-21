package com.geekster;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MaxRepeat {
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,3,6,6,3,7,8,9,9,9,9};
		maxrepeat(arr);
		int sum = 0;
		int max = 0;
		int n = 0;
		for(int i = 0; i < arr.length; i++)
		{
			int x = arr[i];
			for(int j = i+1; j < arr.length; j++)
			{
				if(x == arr[j])
				{
					sum++;
				}
				if(sum > max)
				{
					max = sum;
					n = x;
				}
			}
			sum = 0;
		}
		System.out.println(n);
	}
	static void maxrepeat(int arr[])
	{
		HashMap<Integer, Integer> map = new HashMap();
		for(int i = 0; i < arr.length; i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i],1);
			}
		}
		int max = Integer.MIN_VALUE;
		int mx = 0;
		Set<Integer> ar = map.keySet();
		Iterator<Integer> arr2 = ar.iterator();
		while(arr2.hasNext())
		{
			mx = arr2.next();
			if(map.get(mx)>max)
			{
				max = mx;
			}
			
			
		}
		System.out.println(max);
	}
}
