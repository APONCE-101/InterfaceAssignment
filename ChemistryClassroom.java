import java.util.ArrayList;

public class ChemistryClassroom implements Classroom{
    private String classroomName;
    private ArrayList<Student> students;

    public ChemistryClassroom(String classroomName) {
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
        return "ChemistryClassroom{" +
                "classroomName='" + classroomName + '\'' +
                ", students=" + students +
                '}';
    }
}
