package com.sreedhar;

public class VlcPlayer implements AdvancedMediaPlayer
{
	public void playVlc(String fileName)
	{
		System.out.println("Playing Vlc file: "+fileName);
	}
	
	public void playMp4(String fileName)
	{
		//System.out.println(" Unsupported format. Vlc Player cannot play mp4 files");
	}
}
