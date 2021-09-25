package com.geekster;

public class UserClass 	
{
	//private class variables
	private int userId;
	private long mobileNo;
	private String firstName;
	private String lastName;
	private String userName;
	private String emailId;
	
	public UserClass(int userId, long mobileNo, String firstName, String lastName, String userName, String emailId)
	{	
		this.userId = userId;
		this.mobileNo = mobileNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.emailId = emailId;
		
		System.out.println(this.userId);
		System.out.println(this.mobileNo);
		System.out.println(this.firstName +" "+this.lastName);
		System.out.println(this.userName);
		System.out.println(this.emailId);
		
	}
	public UserClass()
	{
		this.userId = 0000;
		this.mobileNo = 000000l;
		this.firstName = "noName";
		this.lastName = "nothing";
		this.userName = "NoUser";
		this.emailId = "Nothing";
		
		System.out.println(this.userId);
		System.out.println(this.mobileNo);
		System.out.println(this.firstName +" "+this.lastName);
		System.out.println(this.userName);
		System.out.println(this.emailId);

	}
	
	
	
}
