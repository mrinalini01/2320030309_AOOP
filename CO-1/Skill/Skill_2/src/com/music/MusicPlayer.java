package com.music;

public class MusicPlayer {
	
    public static void main(String[] args) {
    	
        MusicSource localFile = new LocalFile();
        MusicSource onlineService = new OnlineStreamingService();
        MusicSource radioStation = new RadioStation();

        MusicSource localFileWithEqualizer = new EqualizerDecorator(localFile);
        MusicSource onlineServiceWithVolumeControl = new VolumeControlDecorator(onlineService);
        MusicSource radioStationWithAllFeatures = new VolumeControlDecorator(new EqualizerDecorator(radioStation));

        System.out.println("Playing local file with equalizer:");
        localFileWithEqualizer.play();

        System.out.println("\nPlaying online service with volume control:");
        onlineServiceWithVolumeControl.play();

        System.out.println("\nPlaying radio station with all features:");
        radioStationWithAllFeatures.play();
    }
}
