package com.sreedhar;

//Decorator pattern: MusicPlayerDecorator

public abstract class MusicPlayerDecorator extends MusicPlayer
{
	//protected MusicPlayer musicPlayer;
	
	public MusicPlayerDecorator(SourceAdapter sourceAdapter)
	{
		super(sourceAdapter);
	}
	
	public abstract void playMusic();
}
