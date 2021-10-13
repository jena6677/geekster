package com.geekster;

public class SwappingString {

	public static void main(String[] args) {
		
		String a = "hello";
		String b = "world";
		System.out.println("before swapping : a = "+ a +" b = "+b);
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("after swapping : a = "+ a +" b = "+b);
	}
}
