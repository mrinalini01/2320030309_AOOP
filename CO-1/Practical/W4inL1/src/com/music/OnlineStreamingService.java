package com.music;

class OnlineStreamingService implements MusicSource {
    @Override
    public void play() {
        System.out.println("Streaming online...");
    }
}
