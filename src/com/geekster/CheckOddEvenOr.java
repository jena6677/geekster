package com.geekster;
import java.util.Scanner;
public class CheckOddEvenOr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if((n | 1) > n)
		{
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}
	}
}
