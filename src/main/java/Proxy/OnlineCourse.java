package Proxy;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {
    private List<VideoLecture> videoLectures = new ArrayList<>();

    public void addVideoLecture(VideoLecture videoLecture) {
        videoLectures.add(videoLecture);
    }

    public void showLectureInfo() {
        for (VideoLecture lecture : videoLectures) {
            lecture.getInfo();
        }
    }

    public void playLecture(int index) {
        if (index >= 0 && index < videoLectures.size()) {
            videoLectures.get(index).play();
        } else {
            System.out.println("Invalid lecture index.");
        }
    }
}
