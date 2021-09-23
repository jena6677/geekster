package com.geekster;

public class Users 
{
	public static void main(String[] args) 
	{
		UserClass user1 = new UserClass();
		UserClass user2 = new UserClass();
		UserClass user3 = new UserClass();
		UserClass user4 = new UserClass();
		UserClass user5 = new UserClass();
		
		//setting user data
		user2.setEmailId("user2@gmail.com");
		user2.setFirstName("User");
		user2.setLastName("2");
		user2.setMobileNo(123456);
		user2.setUserId(2);
		user2.setUserName("user200");
		
		user3.setEmailId("user3@gmail.com");
		user3.setFirstName("User");
		user3.setLastName("3");
		user3.setMobileNo(1234567);
		user3.setUserId(3);
		user3.setUserName("user300");
		
		user4.setEmailId("user4@gmail.com");
		user4.setFirstName("user");
		user4.setLastName("4");
		user4.setMobileNo(234561);
		user4.setUserId(4);
		user4.setUserName("uesr400");
		
		user5.setEmailId("user5@gmail.com");
		user5.setFirstName("User");
		user5.setLastName("5");
		user5.setMobileNo(4567352);
		user5.setUserId(5);
		user5.setUserName("user500");
		
		user1.setEmailId("jenaasutosh23000@gmail.com");
		user1.setFirstName("Asutosh");
		user1.setLastName("Jena");
		user1.setMobileNo(8328889583l);
		user1.setUserId(1);
		user1.setUserName("Jena2020");
		
		//getting user data
		System.out.println(user1.getEmailId());
		System.out.println(user1.getFirstName());
		System.out.println(user1.getLastName());
		System.out.println(user1.getUserName());
		System.out.println(user1.getMobileNo());
		System.out.println(user1.getUserId());

		System.out.println(user2.getEmailId());
		System.out.println(user2.getFirstName());
		System.out.println(user2.getLastName());
		System.out.println(user2.getUserName());
		System.out.println(user2.getMobileNo());
		System.out.println(user2.getUserId());
		
		System.out.println(user3.getEmailId());
		System.out.println(user3.getFirstName());
		System.out.println(user3.getLastName());
		System.out.println(user3.getUserName());
		System.out.println(user3.getMobileNo());
		System.out.println(user3.getUserId());
		
		System.out.println(user4.getEmailId());
		System.out.println(user4.getFirstName());
		System.out.println(user4.getLastName());
		System.out.println(user4.getUserName());
		System.out.println(user4.getMobileNo());
		System.out.println(user4.getUserId());
		
		System.out.println(user5.getEmailId());
		System.out.println(user5.getFirstName());
		System.out.println(user5.getLastName());
		System.out.println(user5.getUserName());
		System.out.println(user5.getMobileNo());
		System.out.println(user5.getUserId());

		
		
	}
}
