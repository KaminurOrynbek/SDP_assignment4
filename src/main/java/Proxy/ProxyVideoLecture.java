package Proxy;

public class ProxyVideoLecture implements VideoLecture {
    private String title;
    private String duration;
    private RealVideoLecture realVideoLecture;

    public ProxyVideoLecture(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public void getInfo() {
        System.out.println("Video Lecture: " + title + " (not loaded yet), Duration: " + duration);
    }

    @Override
    public void play() {
        if (realVideoLecture == null) {
            realVideoLecture = new RealVideoLecture(title, duration);  // Lazy loading
        }
        realVideoLecture.play();
    }
}
