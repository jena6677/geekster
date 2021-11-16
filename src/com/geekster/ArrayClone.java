package com.geekster;

public class ArrayClone {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,9,7,6,5};
		int clone[] = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			clone[i] = arr[i];
		} 
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(clone[i]+" ");
		} 
		
	}
}
