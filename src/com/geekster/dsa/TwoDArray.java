package com.geekster.dsa;

public class TwoDArray {

	public static void main(String[] args) {
		
		int arr[][] = {{2,3,4,5},{6,7,8,9},{10,11,12,13},{14,15,16,17}};
		int sum = 0;
		int sum2= 0;
		for(int i = 0; i < arr.length; i++ )
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if(i == j)
				{
					sum += arr[i][j];
				}
				if(i+j == arr.length-1)
				{
					System.out.println(arr[i][j]);
					sum2+= arr[i][j];
				}
			}
		}
		System.out.println(sum);
		System.out.println(sum2);
	}
}
