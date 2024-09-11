package com.music;

class RadioStation implements MusicSource {
    @Override
    public void play() {
        System.out.println("Playing radio station...");
    }
}
