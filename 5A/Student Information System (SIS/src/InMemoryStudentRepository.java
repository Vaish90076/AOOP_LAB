import java.util.HashMap;
import java.util.Map;

public class InMemoryStudentRepository implements IStudentRepository {
    private Map<String, Student> studentMap = new HashMap<>();

    @Override
    public void addStudent(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void removeStudent(String studentId) {
        studentMap.remove(studentId);
    }

    @Override
    public Student getStudent(String studentId) {
        return studentMap.get(studentId);
    }
}
