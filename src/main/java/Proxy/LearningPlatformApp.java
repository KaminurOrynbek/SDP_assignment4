package Proxy;

public class LearningPlatformApp {
    public static void main(String[] args) {
        OnlineCourse course = new OnlineCourse();

        course.addVideoLecture(new ProxyVideoLecture("Bash Script", "1 hour"));
        course.addVideoLecture(new ProxyVideoLecture("Design Patterns", "2 hours"));
        course.addVideoLecture(new ProxyVideoLecture("Data Structures", "1.5 hours"));

        System.out.println("Showing lecture info (no videos loaded yet):");
        course.showLectureInfo();

        System.out.println("\nPlaying the first lecture:");
        course.playLecture(0);

        System.out.println("\nPlaying the second lecture:");
        course.playLecture(1);

        System.out.println("\nPlaying the first lecture again:");
        course.playLecture(0);
    }
}
