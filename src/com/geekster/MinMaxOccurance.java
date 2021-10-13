package com.geekster;
public class MinMaxOccurance {
	public static void main(String[] args) {
		int big = 0, small = 0;
		String str = "tit for tat is a proverb";
		int arr[] = new int[26];
		int a=0,b=1,c=2,d=3,e=4,f=5,g=6,h=7,i=8,j=9,k=10,l=11,m=12,n=13,o=14,p=15,q=16,r=17,s=18,t=19,u=20,v=21,w=22,x=23,y=24,z=25;
		for(int start =0; start < str.length(); start++)
		{
			if(Character.isAlphabetic(str.charAt(start)))
			{
				if(str.charAt(start) == 'a')
				{
					arr[a]++;
				}
				else if(str.charAt(start) == 'b')
				{
					arr[b]++;
				}
				else if(str.charAt(start) == 'c')
				{
					arr[c]++;
				}
				else if(str.charAt(start) == 'd')
				{
					arr[d]++;
				}
				else if(str.charAt(start) == 'e')
				{
					arr[e]++;
				}
				else if(str.charAt(start) == 'f')
				{
					arr[f]++;
				}
				else if(str.charAt(start) == 'g')
				{
					arr[g]++;
				}
				else if(str.charAt(start) == 'h')
				{
					arr[h]++;
				}
				else if(str.charAt(start) == 'i')
				{
					arr[i]++;
				}
				else if(str.charAt(start) == 'j')
				{
					arr[j]++;
				}
				else if(str.charAt(start) == 'k')
				{
					arr[k]++;
				}
				else if(str.charAt(start) == 'l')
				{
					arr[l]++;
				}
				else if(str.charAt(start) == 'm')
				{
					arr[m]++;
				}
				else if(str.charAt(start) == 'n')
				{
					arr[n]++;
				}
				else if(str.charAt(start) == 'o')
				{
					arr[o]++;
				}
				else if(str.charAt(start) == 'p')
				{
					arr[p]++;
				}
				else if(str.charAt(start) == 'q')
				{
					arr[q]++;
				}
				else if(str.charAt(start) == 'r')
				{
					arr[r]++;
				}
				else if(str.charAt(start) == 's')
				{
					arr[s]++;
				}
				else if(str.charAt(start) == 't')
				{
					arr[t]++;
				}
				else if(str.charAt(start) == 'u')
				{
					arr[u]++;
				}
				else if(str.charAt(start) == 'v')
				{
					arr[v]++;
				}
				else if(str.charAt(start) == 'w')
				{
					arr[w]++;
				}
				else if(str.charAt(start) == 'x')
				{
					arr[x]++;
				}
				else if(str.charAt(start) == 'y')
				{
					arr[y]++;
				}
				else if(str.charAt(start) == 'z')
				{
					arr[z]++;
				}
				
			}
		}
		int min = arr[0],max = arr[o];
		for(int kl = 0; kl < arr.length; kl++)
		{
			if(arr[kl] > max)
			{
				big = kl;
				max = arr[kl];
			}
			if(arr[kl] < min && str.contains(Character.toString((char)(97+kl))))
			{
				small = kl;
				min = arr[kl];
			}
		}
		char bigg = (char) (big+97);
		char smalll = (char) (small+97);
		
		System.out.println(bigg +" - "+ max);
		System.out.println(smalll +" - "+ min);
	}
}
