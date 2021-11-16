package com.geekster;

public class Panagram {

	public static void main(String[] args) {
		
		String str = "abcdefghijklmnopqrstuvwxyz";
		int sum = 0;
		for(int i = 'a'; i <= 'z'; i++)
		{
			String s = String.valueOf(i);
			if(str.contains(s))
			{
				sum++;
				continue;
			}
			else
			{
				System.out.println("its not");
				break;
			}
		}
		if(sum == str.length())
		{
			System.out.println("its a panagram");
		}
		
	}
}
