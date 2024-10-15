package OnlineLearningPlatform;

public class LearningPlatformApp {
    public static void main(String[] args) {
        OnlineCourse course = new OnlineCourse("Design Patterns");

        course.addLecture(new ProxyVideoLecture("Introduction to Design Patterns"));
        course.addLecture(new ProxyVideoLecture("Adapter Pattern"));
        course.addLecture(new ProxyVideoLecture("Bridge patern"));

        course.showLectures();
        System.out.println("\nPlaying first lecture:");
        course.playLecture(0);

        System.out.println("\nPlaying second lecture:");
        course.playLecture(1);

        System.out.println("\nPlaying first lecture again:");
        course.playLecture(0);
    }
}
