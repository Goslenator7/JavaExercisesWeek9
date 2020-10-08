public class Lecture {
    private String lectureName;
    private int weekNumber;


    // Constructor
    public Lecture(String lectureName, int weekNumber) {
        setLectureName(lectureName);
        setWeekNumber(weekNumber);
    }

    // Getters and setters
    public String getLectureName() {
        return this.lectureName;
    }

    public int getWeekNumber() {
        return this.weekNumber;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    // Associate Lecture class and Module class
//    public void setLectureOf(Module lectureOf) {
//        this.lectureOf = lectureOf;
//    }
}
