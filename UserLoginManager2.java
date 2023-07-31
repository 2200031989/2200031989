package com.sreedhar;

public class UserLoginManager2 
{
	private static UserLoginManager2 instance; 
	private boolean isLoggedIn;
	
	private UserLoginManager2() {
		//private constructor to prevent direct instantiation
	}
	
	public static UserLoginManager2 getInstance() 
	{
		if(instance==null) {
			instance=new UserLoginManager2();
		}
		return instance;
	}
	
	public boolean isLoggedIn() {
		return isLoggedIn;
	}
	
	public void login() {
		isLoggedIn = true;
		System.out.println("User Logged in successfully");
	}
	
	public void logout() {
		isLoggedIn = false;
		System.out.println("User Logged out successfully");
	}
}
