package com.geekster.dsa;

public class ReverseWave {

public static void main(String[] args) {
		
		int arr[][] = {{2, 3,  4, 5},
				      {6, 7,  8, 9},
				      {10,11,12,13},
				      {14,15,16,17}};
		
		for(int j = 0; j < arr[0].length; j++)
		{
			if(j % 2 == 0)
			{
				for(int i = arr.length-1; i >= 0; i--)
				{
					System.out.println(arr[i][j]);
				}
			}
			else
			{
				for(int i = 0; i < arr.length; i++)
				{
					System.out.println(arr[i][j]);
				}
			}
		}
	}
}
