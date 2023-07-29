package com.sreedhar;

//Adapter class: MediaAdapter

public class MediaAdapter implements MediaPlayer
{
	private AdvancedMediaPlayer advancedmediaplayer;
	
	public MediaAdapter(String audioType)
	{
		if(audioType.equalsIgnoreCase("vlc"))
		{
			advancedmediaplayer = new VlcPlayer();
		}
		else if(audioType.equalsIgnoreCase("mp4"))
		{
			advancedmediaplayer = new Mp4Player();
		}
	}
	
	public void play(String audioType, String fileName)
	{
		if(audioType.equalsIgnoreCase("vlc"))
		{
			advancedmediaplayer.playVlc(fileName);
		}
		else if(audioType.equalsIgnoreCase("mp4"))
		{
			advancedmediaplayer.playMp4(fileName);
		}
		else
		{
			System.out.println("Unsupported audio format: "+audioType);
		}
	}
}
