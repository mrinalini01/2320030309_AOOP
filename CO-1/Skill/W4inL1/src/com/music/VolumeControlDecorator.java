package com.music;

class VolumeControlDecorator extends MusicSourceDecorator {
    public VolumeControlDecorator(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Volume control applied.");
    }
}

