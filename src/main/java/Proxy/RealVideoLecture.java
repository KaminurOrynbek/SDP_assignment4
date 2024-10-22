package Proxy;

public class RealVideoLecture implements VideoLecture {
    private String title;
    private String duration;

    public RealVideoLecture(String title, String duration) {
        this.title = title;
        this.duration = duration;
        loadVideo();
    }

    private void loadVideo() {
        System.out.println("Loading video lecture: " + title);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getInfo() {
        System.out.println("Video Lecture: " + title + ", Duration: " + duration);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title);
    }
}
