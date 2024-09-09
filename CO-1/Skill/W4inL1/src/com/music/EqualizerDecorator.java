package com.music;

class EqualizerDecorator extends MusicSourceDecorator {
    public EqualizerDecorator(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Equalizer settings applied.");
    }
}
