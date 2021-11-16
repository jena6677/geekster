package com.geekster.dsa;

public class Panagram {

	public static void main(String[] args) {
		boolean flag = false;
		String s = "abcdefghijklmnopqrstuvwxyz";
		int[] arr = new int[26];
		for(int i = 0; i < s.length(); i++)
		{
			int k = s.charAt(i);
			arr[k-97] = 1;
		}
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == 0)
			{
				System.out.println("its not a panagram");
				flag = true;
				break;
			}
		}
		if(flag == false)
		{
			System.out.println("its a panagram");
		}
	}
}
