// Student.java
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String id;
    private List<String> coursesEnrolled;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.coursesEnrolled = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<String> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void enrollInCourse(String courseId) {
        coursesEnrolled.add(courseId);
    }
}
