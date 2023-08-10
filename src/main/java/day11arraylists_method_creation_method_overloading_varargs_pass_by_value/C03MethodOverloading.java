package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;

public class C03MethodOverloading {
    public static void main(String[] args) {

        add(3.5,5.3);
        add(2,3);



    }

    //Create a method adds two integer
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static double add(double a,double b){
        return a+b;
    }

    public static double add(int a, double b){
        return a+b;
    }

    //Note 3: You need to make the parameters different in "method overloading"
    //        To make them different you have 3 ways;
    //           i) Change the number of parameters
    //           ii) Change the data  types of the parameters
    //           iii) Change the places of the parameters, if the data types of the parameters are different
    //Note 4: You can use any access modifier in "method overloading"
    //Note 5: "static" and "non-static" methods can be overloaded. Being static or non-static does not affect "Method Overloading"
    //Note 6: "Method Names" and "Method Parameters" are essentials in Methods
    //        "Method Names" and "Method Parameters" are called "Method Signature"
    //        If you want to check two methods are same or not look at just "Method Names" and "Method Parameters"
    //        "Access Modifiers", "Return Types", "static keyword" cannot make methods different from each other.
    //Note 7: Java is an "Object-Oriented Programming Language"(OOP)
    //        OOP has 4 principals; i)Inheritance
    //                              ii)Polymorphism = Method Overloading + Method Overriding
    //                              iii)Encapsulation
    //                              iv)Abstraction


}
