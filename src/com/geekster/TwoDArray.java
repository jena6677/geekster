package com.geekster;
import java.util.Scanner;
public class TwoDArray {

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
		int k = arr[0][0];
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if(i == j)
				{
					if(arr[i][j] == k)
					{
						continue;
					}
					else
					{
						sum++;
						break;
					}
				}
			}
			if(sum > 0)
			{
				break;
			}
		}
		if(sum > 0)
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
	}
}
