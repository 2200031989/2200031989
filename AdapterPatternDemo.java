package com.sreedhar;

public class AdapterPatternDemo {

	public static void main(String[] args) 
	{
		MediaPlayer audioPlayer=new AudioPlayer();
		
		audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("vlc", "movie.vlc");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("avi", "video.avi");
	}

}