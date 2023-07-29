package com.sreedhar;

public class EndUserClass {

	public static void main(String[] args) 
	{
		// Create source adapters
        SourceAdapter localFileAdapter = new LocalFileAdapter();
        SourceAdapter onlineStreamingAdapter = new OnlineStreamingAdapter();
        SourceAdapter radioStationAdapter = new RadioStationAdapter();
        
        // Create music players
        MusicPlayer basicMusicPlayer = new BasicMusicPlayer(localFileAdapter);
        MusicPlayer shuffleMusicPlayer = new ShuffleMusicPlayer(onlineStreamingAdapter);
        MusicPlayer repeatMusicPlayer = new RepeatMusicPlayer(radioStationAdapter);
        
        // Play music using different music players
        basicMusicPlayer.playMusic();
        System.out.println("--------------------");
        shuffleMusicPlayer.playMusic();
        System.out.println("--------------------");
        repeatMusicPlayer.playMusic();
	}

}
