package com.sreedhar;

public class Mp4Player implements AdvancedMediaPlayer
{
	public void playVlc(String fileName)
	{
		System.out.println("Unsupported format. MP4 Player cannot play VLC files.");
	}
	
	public void playMp4(String fileName)
	{
		System.out.println("Playing MP4 file: "+fileName);
	}
}
