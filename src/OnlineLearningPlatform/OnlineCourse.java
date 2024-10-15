package OnlineLearningPlatform;
import java.util.ArrayList;
import java.util.List;
public class OnlineCourse {
    private String courseName;
    private List<VideoLecture> videoLectures = new ArrayList<>();

    public OnlineCourse(String courseName) {
        this.courseName = courseName;
    }

    public void addLecture(VideoLecture lecture) {
        videoLectures.add(lecture);
    }

    public void showLectures() {
        System.out.println("Course: " + courseName);
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
