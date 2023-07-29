package com.sreedhar;

//Concrete class: AudioPlayer

public class AudioPlayer implements MediaPlayer
{
	private MediaAdapter mediaadapter;
	
	public void play(String audioType, String fileName)
	{
		if(audioType.equalsIgnoreCase("mp3"))
		{
			System.out.println("Playing mp3 file: "+fileName);
		}
		else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4"))
		{
			mediaadapter=new MediaAdapter(audioType);
			mediaadapter.play(audioType, fileName);
		}
		else
		{
			System.out.println("Unsupported audio format: "+audioType);
		}
		
	}
}

