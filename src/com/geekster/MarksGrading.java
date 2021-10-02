package com.geekster;

public class MarksGrading 
{
	public static void main(String[] args) {
		
		int mark = 90;
		
		if(mark < 40)
		{
			System.out.println("fail");
		}
		else if(mark >= 40 && mark <60 )
		{
			System.out.println("c grade");
		}
		else if(mark >= 60 && mark < 80)
		{
			System.out.println("b grade");
		}
		else if(mark >= 80 && mark < 90)
		{
			System.out.println("a grade");
		}
		else if(mark >= 90)
		{
			System.out.println("a+");
		}
		
	}
}
