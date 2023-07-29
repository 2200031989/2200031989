package com.sreedhar;

//Concrete Adapters: LocalFileAdapter, OnlineStreamingAdapter, RadioStationAdapter

public class OnlineStreamingAdapter implements SourceAdapter
{
	public void connect()
	{
		System.out.println("Connecting to online streaming service..!");
	}
	
	public void disconnect()
	{
		System.out.println("Disconnecting from the online streaming service..!");
	}
	
	public void play()
	{
		System.out.println("Streaming Music from Online Streaming Service...!");
	}
}
