package com.geekster;

import java.util.HashMap;

public class GetFrequency {

	public static void main(String[] args) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		String str = "aaabbbcccddeeeffffksacd";
		
		for(int i = 0; i < str.length(); i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else
			{
				map.put(str.charAt(i), 1);
			}
		}
		for(char i : map.keySet())
		{
			System.out.println(i +" - "+map.get(i));
		}
	}
}
