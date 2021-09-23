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
	
	//setter methods
	public void setUserId(int userId)
	{
		this.userId = userId;
	}
	public void setMobileNo(long mobileNo)
	{
		this.mobileNo = mobileNo;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}
	
	//getter methods
	public int getUserId()
	{
		return this.userId;
	}
	public long getMobileNo()
	{
		return this.mobileNo;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public String getUserName()
	{
		return this.userName;
	}
	public String getEmailId()
	{
		return this.emailId;
	}
}
