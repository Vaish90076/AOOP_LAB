// InMemoryStudentRepository.java
import java.util.HashMap;
import java.util.Map;

public class InMemoryCourseRepository implements ICourseRepository {
    private Map<String, Course> courseMap = new HashMap<>();

    @Override
    public void addCourse(Course course) {
        courseMap.put(course.getCourseId(), course);
    }

    @Override
    public void removeCourse(String courseId) {
        courseMap.remove(courseId);
    }

    @Override
    public Course getCourse(String courseId) {
        return courseMap.get(courseId);
    }
}
