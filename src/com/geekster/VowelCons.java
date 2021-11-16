package com.geekster;

public class VowelCons {

	public static void main(String[] args) {
		
		String s = "this is a really simple question";
		int v = 0, c = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u')
			{
				v++;
			}
			else if(s.charAt(i) == ' ')
			{
				continue;
			}
			else
			{
				c++;
			}
		}
		System.out.println("v = "+v +" "+ "c = "+c);
	}
}
