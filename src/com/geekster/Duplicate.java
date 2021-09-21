package com.geekster;
import java.util.HashMap;
public class Duplicate {
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5,3};
		repeat(arr);
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			int x = arr[i];
			for(int j = i+1; j < arr.length; j++)
			{
				if(x == arr[j])
				{
					sum++;
					System.out.println(x);
					break;
				}
				if(sum > 0)
				{
					break;
				}
			}
		}
	}
	static void repeat(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap();
		for(int i = 0; i < arr.length; i++)
		{
			if(map.containsKey(arr[i]))
			{
				System.out.println(arr[i]);
				break;
			}
			else
			{
				map.put(arr[i],1);
			}
		}
		
	}
}
