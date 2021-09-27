package com.patterns;
import java.util.Scanner;
public class DiamondNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 0;
		int d = 0;
		for(int i = 1; i <= n*2-1; i++)
		{
			int l = i;
			if(i <= n*2/2)
			{
				for(int j = 1; j <= n-i; j++)
				{
					System.out.print(" ");
				}
				for(int j = 1; j <= i*2-1;j++)
				{
					
					if(l >= 1)
					{
						System.out.print(l);
						l--;
						if(l == 0)
						{
							d = l+1;
						}
					}
					else
					{
						System.out.print(d+1);
						d++;
					}
					
					k = i*2-1;
				}
				System.out.println();
			}
			if(i > n*2/2)
			{
				k = k - 2;
				int e = k/2+1;
				for(int j = 1; j <= i-n; j++)
				{
					System.out.print(" ");
				}
				for(int j = 1; j <= k; j++)
				{
					if(e >= 1)
					{
						System.out.print(e);
						e--;
						if(e == 0)
						{
							d = e+1;
						}
					}
					else
					{
						System.out.print(d+1);
						d++;
					}
					
				}
				System.out.println();
			}
		}
		
	}
}
