package com.geekster;

public class ArrayAvg {

	public static void main(String[] args) {
		double sum = 0;
		int arr[] = {1,2,3,5,9,14,19,6};
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		System.out.println(sum/(arr.length-1));
	}
}
