package com.sreedhar;

//Concrete Decorator: ShuffleMusicPlayer

public class ShuffleMusicPlayer extends MusicPlayerDecorator
{
	public ShuffleMusicPlayer(SourceAdapter sourceAdapter)
	{
		super(sourceAdapter);
	}
	
	public void playMusic()
	{
		System.out.println("Shuffling music playlist...");
        sourceAdapter.connect();
        sourceAdapter.play();
        sourceAdapter.disconnect();
	}
}
