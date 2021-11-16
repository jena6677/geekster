package com.geekster.dsa;

public class FnLOccString {

	public static void main(String[] args) {
		
		String s = "asutosh";
		System.out.println(firstoccur(s,'k', s.length()-1));
		System.out.println(lastoccur(s,'s', 0));
	}
	static int firstoccur(String s,char c, int size)
	{
		if(size < 0)
		{
			return -1;
		}
		if(c == s.charAt(size))
		{
			return size;
		}
		return firstoccur(s,c,--size);
	}
	static int lastoccur(String s,char c, int size)
	{
		if(size == s.length())
		{
			return -1;
		}
		if(c == s.charAt(size))
		{
			return size;
		}
		return firstoccur(s,c,++size);
	}
}
