public class DemoLectures {
    public static void main(String[] args) {
        Lecture l1 = new Lecture("Variables", 1);
        Lecture l2 = new Lecture("Data Types", 2);
        Lecture l3 = new Lecture("Methods", 3);
        Lecture l4 = new Lecture("Methods Part 2", 4);
        Lecture l5 = new Lecture("Arrays", 5);
        Lecture l6 = new Lecture("Collections", 6);
        Lecture l7 = new Lecture("Associations", 7);

        Module module = new Module();

        Module.addLecture(l1);
        Module.addLecture(l2);
        Module.addLecture(l3);
        Module.addLecture(l4);
        Module.addLecture(l5);
        Module.addLecture(l6);
        Module.addLecture(l7);


    }
}
