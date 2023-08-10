package day16oop;

       /*
        Encapsulation: It means "data hiding"
        Why do you need to hide data?
        i) Because some data should not be public like "ID"
           "Credit Card Number", "SSN", etc.
        ii) Because we do not want some data to be accessible from the other classes.
        How do you do encapsulation?
        To hide data I use "private" access modifiers
        Note: set and get methods are called "Java Beans"
        */

public class C05Student {

    private String stdId = "TH001";
    private String illness ="Headache";
    private double gpa = 3.9;
    private boolean disability = false;

    //How to create the encapsulated data even when we can not see it?
    //we create get() methods (also called getters)

    public String getStdId(){
        return stdId;
    }
    public String getIllness(){
        return illness;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isDisability() { // get() method for boolean data type starts with "is" all others starts with "get".
        return disability;
    }
    // How to update the encapsulated data even when we can not see it?
    // set() method (setters) is used to update the encapsulated data

    public void setStdId(String stdId){
        this.stdId = stdId;
    }
    public void setIllness(String illness){
        this.illness = illness;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setDisability(boolean disability) {
        this.disability = disability;
    }
}
