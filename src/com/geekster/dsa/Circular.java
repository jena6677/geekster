package com.geekster.dsa;

public class Circular {

	public static void main(String[] args) {
		
		int arr[][] = {{2, 3,  4, 5},
					   {6, 7,  8, 9},
					   {10,11,12,13},
					   {14,15,16,17}};
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr.length-1;
		int size = arr.length * arr[0].length;
		int count = 0;
		while(count < size)
		{
			//left wall
			for(int i = minr, j = minc; i <= maxr && count < size ; i++)
			{
				System.out.println(arr[i][j]);
				count++;
			}
			minc++;
			//bottom wall
			for(int i = minc, j = maxr; i <= maxc && count < size; i++)
			{
				System.out.println(arr[j][i]);
				count++;
			}
			maxr--;
			//right wall
			for(int i = maxr, j = maxc; i >= minr && count < size; i--)
			{
				System.out.println(arr[i][j]);
				count++;
			}
			maxc--;
			//top wall
			for(int i = minr, j = maxc; j >= minc && count < size; j--)
			{
				System.out.println(arr[i][j]);
				count++;
			}
			minr++;
		}
	}
}
