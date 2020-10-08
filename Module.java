import javax.swing.*;
import java.util.ArrayList;

public class Module {
    private String moduleTitle;
    private ArrayList<Lecture> lectures = new ArrayList<Lecture>(); // Create collection of lectures

    // Constructor
    public Module(String moduleTitle) {
        setModuleTitle(moduleTitle);
    }

    // Formulate message to be presented as output when displayDetails() method is called. Pass contents to the calling method.
    public String toString() {

        String output;

        output = "Module title: " + this.getModuleTitle();

        for (Lecture tempLecture : this.lectures) {
            output = output +"\n Week "+tempLecture.getWeekNumber()+" -\t"+tempLecture.getLectureName();
        }
        return output;
    }

    // Display message as detailed in toString() method
    public void displayDetails() {

        String output = toString();

        JOptionPane.showMessageDialog(null, output);
    }

    // Add lecture to the collection of lectures
    public void addLecture(Lecture aLecture) {
        this.lectures.add(aLecture);
    }

    // Getters and setters
    public String getModuleTitle() {
        return this.moduleTitle;
    }

    public void setModuleTitle(String moduleTitle) {
        this.moduleTitle = moduleTitle;
    }

}
