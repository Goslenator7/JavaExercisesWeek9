public class Postgraduate extends Student {

    private String formerDegree;

    // Constructor
    public Postgraduate(String name, String address, int age, int matricNumber, String formerDegree) {
        super(name, address, age, matricNumber);
        setFormerDegree(formerDegree);
    }

    // get details and place in string for output
    public String getDetails() {
        String output;

        output = super.getDetails()+"\nFormer Degree: "+getFormerDegree()+"\n";
        return output;
    }

    // getters and setters

    public String getFormerDegree() {
        return this.formerDegree;
    }

    public void setFormerDegree(String formerDegree) {
        this.formerDegree = formerDegree;
    }
}
