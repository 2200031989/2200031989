package com.sreedhar;

//Concrete Adapters: LocalFileAdapter, OnlineStreamingAdapter, RadioStationAdapter

public class LocalFileAdapter implements SourceAdapter
{
	public void connect()
	{
		System.out.println("Connecting Local File source..!");
	}
	
	public void disconnect()
	{
		System.out.println("Disconnecting from local file source..!");
	}
	
	public void play()
	{
		System.out.println("Playing Music from the local file source...!");
	}
	
}
