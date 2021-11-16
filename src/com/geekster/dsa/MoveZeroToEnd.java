package com.geekster.dsa;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		
		int arr[] = {1,0,1,0,1,0,1,0,1,0};
		int start = 0;
		int start2 = 0;
		int end =  arr.length-1;
		while(start < end && start2 <= end)
		{
			if(arr[start] == 0)
            {
               start2++;
               if(start2 <= end)
               {
                   if(arr[start2] != 0)
                   {
                       int temp = arr[start2];
                       arr[start2] = arr[start];
                       arr[start] = temp;
                       start++;
                   }
               }
            }
            else
            {
                start++;
                start2++;
            }
		}
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
}
