package com.geekster.dsa;

public class RemovwAllDuplicate {

	public static void main(String[] args) {
		
		int arr[] = new int[26];
		String s = "abcacbdfbbrfd";
		removeDuplicate(s,"",arr,0,s.length()-1);
	}
	static void removeDuplicate(String s,String y,int[] arr, int start, int end)
	{
		if(start > end)
		{
			System.out.println(y);
			return;
		}
		if(arr[s.charAt(start)-'a'] == 0)
		{
			y=y+s.charAt(start);
			arr[s.charAt(start)-'a'] = 1;
		}
		removeDuplicate(s,y,arr,++start,end);
	}
}
