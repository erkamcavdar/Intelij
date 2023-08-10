package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;

public class C02MethodCreation {
    public static void main(String[] args) {

        //Method call: Using a method in "main" method is called "Method Call"
        int r1 = add(3,5);//Non-static method 'add(int, int)' cannot be referenced from a static context
        System.out.println(r1);

        //Method call
        double r2 = multiplyThreeNumbers(1.2, 4, 5.31);//I called multiply three letter from main method
        System.out.println(r2);
                                         //Arguments
        //Method call
        String r3 = joinTwoStrings("Erkam","Cavdar");
        System.out.println(r3);
    }


    public static int add(int a, int b){
                        //parameter
        return a+b;


    }

    //Create a method to multiply 3 number
    public static double multiplyThreeNumbers(double a, double b, double c){
                                              //parameter
        return a*b*c;

    }

    public static String joinTwoStrings(String a,String b){

        return a+b;
    }
    //Note: Variables used in method creation are called parameters
    //      Actural values used in method call are called arguments
}
