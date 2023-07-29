package com.sreedhar;

//Refined Abstraction: BasicMusicPlayer

public class BasicMusicPlayer extends MusicPlayer
{
	public BasicMusicPlayer(SourceAdapter sourceAdapter)
	{
		super(sourceAdapter);
	}
	
	public void playMusic()
	{
		sourceAdapter.connect();
		sourceAdapter.disconnect();
		sourceAdapter.play();
	}
}
