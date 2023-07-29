package com.sreedhar;

//Concrete Adapters: LocalFileAdapter, OnlineStreamingAdapter, RadioStationAdapter

public class RadioStationAdapter implements SourceAdapter
{
	public void connect()
	{
		System.out.println("Tuning into Radio Station..!");
	}
	
	public void disconnect()
	{
		System.out.println("Turning off Radio Station..!");
	}
	
	public void play()
	{
		System.out.println("Playing music from Radio Station...!");
	}
}
