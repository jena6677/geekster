package com.geekster;

public class ConsVowel {

	public static void main(String[] args) {
		
		String s = "this! is also an, simple question";
		int v = 0, c= 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u')
				{
					v++;
				}
				else
				{
					c++;
				}
			}
		}
		System.out.println("v = "+v);
		System.out.println("c = "+c);
	}
}
