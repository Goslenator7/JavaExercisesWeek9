import javax.swing.*;

public abstract class Student {

    private String name;
    private String address;
    private int age;
    private int matricNumber;

    // Constructor
    public Student(String name, String address, int age, int matricNumber) {
        setName(name);
        setAddress(address);
        setAge(age);
        setMatricNumber(matricNumber);
    }

    // Get details and create string for output
    public String getDetails() {
       String output;

       output = "Name: "+getName()+"\n Address: "+getAddress()+"\n Age: "+getAge()+"\n Matriculation number: "+getMatricNumber();
       return output;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMatricNumber() {
        return matricNumber;
    }

    public void setMatricNumber(int matricNumber) {
        this.matricNumber = matricNumber;
    }

}
