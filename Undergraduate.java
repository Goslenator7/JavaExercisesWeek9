public class Undergraduate extends Student {

    private String formerSchool;

    // Constructor with Student as super class
    public Undergraduate(String name, String address, int age, int matricNumber, String formerSchool) {
        super(name, address, age, matricNumber);
        setFormerSchool(formerSchool);
    }

    // Get the details and place in a string
    public String getDetails() {
        String output;

        output = super.getDetails()+"\nFormer School: "+getFormerSchool()+"\n";
        return output;
    }

    //public void displayDetails() {
      //  String details = getDetails();
    //}

    // getters and setters

    public String getFormerSchool() {
        return formerSchool;
    }

    public void setFormerSchool(String formerSchool) {
        this.formerSchool = formerSchool;
    }
}
