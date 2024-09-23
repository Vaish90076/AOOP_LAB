// Client.java
public class Client {
    public static void main(String[] args) {
        // Create repositories
        IStudentRepository studentRepository = new InMemoryStudentRepository();
        ICourseRepository courseRepository = new InMemoryCourseRepository();

        // Add students
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");
        studentRepository.addStudent(student1);
        studentRepository.addStudent(student2);

        // Add courses
        Course course1 = new Course("C001", "Mathematics");
        Course course2 = new Course("C002", "Physics");
        courseRepository.addCourse(course1);
        courseRepository.addCourse(course2);

        // Manage enrollment
        EnrollmentManager enrollmentManager = new EnrollmentManager(studentRepository, courseRepository);
        enrollmentManager.enrollStudent("S001", "C001");
        enrollmentManager.enrollStudent("S002", "C002");
    }
}
