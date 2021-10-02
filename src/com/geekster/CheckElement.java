package com.geekster;
import java.util.Scanner;
public class CheckElement {
	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("enter 5 elements");
		for(int i = 0; i < 5; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print("enter the value you want to check : ");
		int target = sc.nextInt();
		for(int i = 0; i < 5; i++)
		{
			if(arr[i] == target)
			{
				System.out.println("target found at "+ i+ "th position");
				a++;
				break;
			}
		}
		if(a == 0)
		{
			System.out.println("target not found!!!!");
		}
		
	}
}
