package com.geekster;

public class RemoveSpace {

	public static void main(String[] args) {
		
		String s = "remove the spaces in this string";
		
		String str = s.replaceAll("\\s", "");
		
		System.out.println(str);
	}
}
