public class DemoInherAndAssoc {
    public static void main(String[] args) {

        // Create lecturer object
        Lecturer teacher1 = new Lecturer("Mr Tom");


        // Create student objects from abstract class
        Undergraduate under1 = new Undergraduate("Naruto Uzumaki", "Konoha", 14, 7384473, "Konoha Ninja School");
        Postgraduate post1 = new Postgraduate("Kakashi Hatake", "Konoha", 32, 834774837, "BEng Anbu training");

        // Add student to list of students for that lecturer
        teacher1.addStudent(under1);
        teacher1.addStudent(post1);

        teacher1.studentsAsString();
    }
}
