package com.geekster;

public class DivideArray {

	public static void main(String[] args) {
		String s = "aaabbbccc";
		int k = 0;
		for(int i = 0; i < 9; i++) {
			
			if((i+1)%3 != 0)
			{
				System.out.print(s.charAt(i));
			}
			else
			{
				System.out.print(s.charAt(i)+" ");
			}
		}
		
	}
}
