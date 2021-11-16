package com.geekster;
import java.util.*;
public class TitForTat {

	public static void main(String[] args) {
		
		String s = "tit for tat";
		HashMap<Character, Integer> map = new HashMap<>();
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		char key1='c',key2='c';
		for(int i  = 0; i < s.length(); i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				if(map.containsKey(s.charAt(i)))
				{
					map.put(s.charAt(i), map.get(s.charAt(i))+1);
				}
				else
				{
					map.put(s.charAt(i), 1);
				}
			}
		}
		Set<Character> st = map.keySet();
		Iterator<Character> it = st.iterator();
		while(it.hasNext())
		{
			char c = it.next();
			if(map.get(c) > max)
			{
				key1 = c;
				max = map.get(c);
			}
			if(map.get(c) < min)
			{
				key2 = c;
				min = map.get(c);
			}
		}
		System.out.println(key1+" - "+ max +" "+key2 +" - "+min);
	}
}
