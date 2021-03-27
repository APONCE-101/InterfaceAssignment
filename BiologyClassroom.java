import java.util.ArrayList;

public class BiologyClassroom implements Classroom {

    private String classroomName;
    private ArrayList<Student> students;

    public BiologyClassroom(String classroomName) {
        this.classroomName = classroomName;
        students = new ArrayList<>();
    }

    @Override
    public String addStudent(Student student) {
        students.add(student);
        return student.getFirstName() + " " + student.getLastName() + " has been added";
    }

    @Override
    public String removeStudent(Student student) {
        students.remove(students.indexOf(student));
        return student.getFirstName() + " " + student.getLastName() + " has been removed";

    }
    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "BiologyClassroom{" +
                "classroomName='" + classroomName + '\'' +
                ", students=" + students +
                '}';
    }
}
