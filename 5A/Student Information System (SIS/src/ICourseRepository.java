public interface ICourseRepository {
    void addCourse(Course course);
    void removeCourse(String courseId);
    Course getCourse(String courseId);
}
