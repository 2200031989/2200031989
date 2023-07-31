package com.sreedhar;

public class LoggerDemo1 
{
	public static void main(String[] args)
	{
		Logger1 l=Logger1.getInstance();
		l.log("singleton pattern message");
		
		//trying to create another instance of logger will still run the same instance
		Logger1 l1=Logger1.getInstance();
		l1.log("sreedhar");
		System.out.println(l==l1);
	}
}
