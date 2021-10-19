package com.geekster;
import java.util.Scanner;
public class SumEqual {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		int sum1 = 0, sum2= 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if(j == 0 || j == 1)
				{
					sum1 += arr[i][j];
				}
				else
				{
					sum2 += arr[i][j];
				}
			}
		}
		if(sum1 == sum2)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
