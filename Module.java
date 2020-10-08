import javax.swing.*;
import java.util.ArrayList;

public class Module {
    private String moduleTitle;
    // Create collection of lectures
    private ArrayList<Lecture> lectures = new ArrayList<Lecture>();

    // Constructor
    public Module(String moduleTitle) {
        setModuleTitle(moduleTitle);
    }

    public String toString() {
        String output;
        output = "Module title: " + this.getModuleTitle();
        for (Lecture tempLecture : this.lectures) {
            output = output +"\n"+tempLecture.toString();
        }
        return output;
    }

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
