package com.geekster.dsa;

public class MoveAllXToLast {

	public static void main(String[] args) {
		
		String s = "abcxgfxbxhgx";
		moveLast(s,"",0,s.length()-1);
	}
	static void moveLast(String s, String y, int start, int size)
	{
		if(start > size)
		{
			System.out.println(y);
			return;
		}
		if(s.charAt(start) == 'x')
		{
			y = y+s.charAt(start);
		}
		else
		{
			y = s.charAt(start)+y;
		}
		moveLast(s,y,++start,size);
	}
}
