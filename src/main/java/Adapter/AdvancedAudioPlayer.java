package Adapter;

public class AdvancedAudioPlayer implements WAVPlayer, AACPlayer {
    @Override
    public void playWAV(String fileName) {
        System.out.println("Playing WAV: " + fileName);
    }

    @Override
    public void playAAC(String fileName) {
        System.out.println("Playing AAC: " + fileName);
    }
}
