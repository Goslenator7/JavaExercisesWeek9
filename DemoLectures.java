public class DemoLectures {
    public static void main(String[] args) {

        // Create new Module
        Module moduleOne = new Module("Software Development");

        // Create new lectures to add to Module
        Lecture l1 = new Lecture("Variables", 1);
        Lecture l2 = new Lecture("Data Types", 2);
        Lecture l3 = new Lecture("Methods", 3);
        Lecture l4 = new Lecture("Methods Part 2", 4);
        Lecture l5 = new Lecture("Arrays", 5);
        Lecture l6 = new Lecture("Collections", 6);
        Lecture l7 = new Lecture("Associations", 7);

        // Add lectures to module with collection of lectures
        moduleOne.addLecture(l1);
        moduleOne.addLecture(l2);
        moduleOne.addLecture(l3);
        moduleOne.addLecture(l4);
        moduleOne.addLecture(l5);
        moduleOne.addLecture(l6);
        moduleOne.addLecture(l7);

        // Print the name of the module and the week numbers and lecture names of each lecture
        moduleOne.displayDetails();
    }
}
