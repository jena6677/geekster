package com.geekster;
import java.util.Scanner;
public class AndOrOperation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		System.out.println("or operation "+(n|x));
		System.out.println("and operation "+(n&x));
	}
}
