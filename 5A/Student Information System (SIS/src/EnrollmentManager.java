// EnrollmentManager.java
public class EnrollmentManager {
    private IStudentRepository studentRepository;
    private ICourseRepository courseRepository;

    public EnrollmentManager(IStudentRepository studentRepository, ICourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public void enrollStudent(String studentId, String courseId) {
        Student student = studentRepository.getStudent(studentId);
        Course course = courseRepository.getCourse(courseId);
        if (student != null && course != null) {
            student.enrollInCourse(courseId);
            course.addStudent(student);
            System.out.println(student.getName() + " enrolled in " + course.getCourseName());
        }
    }
}
