import javax.swing.*;
import java.util.ArrayList;

public class Lecturer {

    private String name;

    public Lecturer(String name) {
        setName(name);
    }

    // Create list of abstract students which contain both under and post grads
    private ArrayList<Student> students = new ArrayList<>();

    // method to add student to list of student
    public void addStudent(Student aStudent) {
        this.students.add(aStudent);
    }

    // Loop through the list of students for that lecturer and get their details
    public void studentsAsString() {
        String output;

        output = "Lecturer: "+getName()+" teaches:\n";

        for (Student tempStudent : this.students) {
            output = output +"\n"+tempStudent.getDetails();
        }

        JOptionPane.showMessageDialog(null, output, "Details", JOptionPane.INFORMATION_MESSAGE);
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
