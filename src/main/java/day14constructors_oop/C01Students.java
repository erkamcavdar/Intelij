package day14constructors_oop;

        /*
           1) Constructors are for "Object Creation"
              If you do not have constructor in a class it is impossible to create an object
           2) When you create class, Java gives you a constructor automatically,
              This constructor is invisible because it comes from Parent Object class.
              This "invisible constructor" is called "Default constructor"
           3) If you need . you can create a constructor in a Class, Java deletes the "Default Constructor"
           4) You can create constructor manually by the help of Intellij(Recommended)
           5)We create multiple constructors by changing the parameters
           6) Having different constructors make the class template flexible to create different objects.

           Question: What is the difference between "Constructor and "Methods"?
                  1) "Constructors" are used to create Objects, "Methods" are used to do some actions.
                  2) "Constructors" do not have "return types" but "Methods" have.
                  3) "Constructor Names" must be  the same with the class name, but "Method Names" can
                  be any name
        */

public class C01Students {

    public String stdNAme = "Tom Hanks";
    public int stdAge=13;
    private String stdId = "TH2010001";


    public void study(){
        System.out.println("Study well...");
    }
    public void doSport(){
        System.out.println("Sport is good for health...");
    }

    //Create a constructor manually
    public C01Students(){

    }

    public C01Students(String stdNAme, int stdAge, String stdId){

        this.stdNAme = stdNAme;
        this.stdAge = stdAge;
        this.stdId = stdId;
    }



    //Create a constructor by the help of the Intellij
    public C01Students(String stdNAme, int stdAge) {
        this.stdNAme = stdNAme;
        this.stdAge = stdAge;
    }
}
