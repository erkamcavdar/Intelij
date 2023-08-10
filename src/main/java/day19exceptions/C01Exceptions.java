package day19exceptions;


       /*
          1)Exceptions are strict rules in JAVA to protect developers from critical mistakes
           For example, you created a method uses division operation, and you are not good at math.
           You think any number can be divided by any other number, but actually it is not.
           Zero cannot be divisor in Math, when you make zero divisor, Java will give you a message explains the rule and stops the execution



        */

public class C01Exceptions {
    public static void main(String[] args) {
        //Exp1
        System.out.println(divide(6, 2));
        System.out.println(divide(0, 5));
        System.out.println(divide(12, 0));//ArithmeticExceptions: Java throws ArithmeticExceptions whem you get a mistake in math rules
        System.out.println("Hi");
        //Exp2
        System.out.println(doDivision(12, 0));

        //Exp3
        System.out.println(getNumOfChars("java"));
        System.out.println(getNumOfChars(""));
        System.out.println(getNumOfChars(null));// NullPointerException: Java throws NullPointerExceptions when you use "null" value for some String methods


    }



    //1.Way to handle Exceptions
    public static int divide(int a, int b){
        if(b==0){
            return 0;
        }
        return a/b;
    }

    //2.Way to handle Exceptions
    public static int doDivision(int a, int b){
        int result = 0;
        try{
            result = a/b;
            System.out.println("Hi Java!");
        }catch(ArithmeticException e){
            result =0;
        }
        return result;
    }

    //Create a method to get the number of characters in a String
    //1.Way to handle Exceptions (not recommended)
    public static int getNumOfChars(String s){
        if(s==null){
            return 0;
        }
        return s.length();
    }

    //2.Way
    public static int getNumOfCharacters(String s){
        int result = 0;

        try{
            result = s.length();
        }catch(NullPointerException e){
            result = 0;
        }
        return result;
    }



}
