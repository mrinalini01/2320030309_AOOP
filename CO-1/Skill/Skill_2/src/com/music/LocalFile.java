package com.music;

class LocalFile implements MusicSource {
    @Override
    public void play() {
        System.out.println("Playing local file...");
    }
}