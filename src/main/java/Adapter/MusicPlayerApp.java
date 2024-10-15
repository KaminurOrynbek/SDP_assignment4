package Adapter;

public class MusicPlayerApp {
    public static void main(String[] args) {
        AudioPlayer mp3Player = new MP3Player();
        mp3Player.play("mp3", "song.mp3");

        AudioPlayer adapter = new AudioAdapter();
        adapter.play("wav", "song.wav");
        adapter.play("aac", "song.aac");
    }
}
