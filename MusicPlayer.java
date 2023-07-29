package com.sreedhar;

//Bridge pattern: MusicPlayer

public abstract class MusicPlayer 
{
	protected SourceAdapter sourceAdapter;
	
	public MusicPlayer(SourceAdapter sourceAdapter)
	{
		this.sourceAdapter = sourceAdapter;
	}
	
	public abstract void playMusic();
}
