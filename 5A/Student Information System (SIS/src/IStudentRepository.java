public interface IStudentRepository {
    void addStudent(Student student);
    void removeStudent(String studentId);
    Student getStudent(String studentId);
}
