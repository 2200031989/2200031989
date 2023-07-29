package com.sreedhar;

//Concrete Decorator: RepeatMusicPlayer

public class RepeatMusicPlayer extends MusicPlayerDecorator
{
	public RepeatMusicPlayer(SourceAdapter sourceAdapter)
	{
		super(sourceAdapter);
	}
	
	public void playMusic()
	{
		System.out.println("Repeating current track...");
        sourceAdapter.connect();
        sourceAdapter.play();
        sourceAdapter.disconnect();
	}
}
