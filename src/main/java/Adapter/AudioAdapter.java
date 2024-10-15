package Adapter;

public class AudioAdapter implements AudioPlayer {
    AdvancedAudioPlayer advancedAudioPlayer;

    public AudioAdapter() {
        this.advancedAudioPlayer = new AdvancedAudioPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("wav")) {
            advancedAudioPlayer.playWAV(fileName);
        } else if (audioType.equalsIgnoreCase("aac")) {
            advancedAudioPlayer.playAAC(fileName);
        } else {
            System.out.println("Invalid audio type: " + audioType + ". Supported types are WAV and AAC.");
        }
    }
}
