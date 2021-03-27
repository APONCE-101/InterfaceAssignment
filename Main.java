import java.nio.channels.ClosedSelectorException;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student(12345, "Marie","Lewis");
        Student s2 = new Student(56780, "Lewis", "Capaldi");
        Student s3 = new Student(70789,"Kent","Washington");

        Student[] students = {s1, s2, s3};
        System.out.println("Students:\n" + s1.toString() + "\n" + s2.toString() + "\n" + s3.toString() + "\n");

        Classroom bio = new BiologyClassroom("Biology");
        Classroom eng = new EnglishClassroom("English");
        Classroom chem = new ChemistryClassroom("Chemistry");

        System.out.println("Classrooms before enrollment:\n" + bio.toString() + "\n"
                + eng.toString() + "\n" + chem.toString() + "\n");

        for (Student s : students) {
            bio.addStudent(s);
            eng.addStudent(s);
            chem.addStudent(s);
        }
        System.out.println("Classrooms after enrollment:\n" + bio.toString() + "\n"
                + eng.toString() + "\n" + chem.toString() + "\n");

    }





}
