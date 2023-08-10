package day05ternarystatement_stringmanipulations;

public class C01TernaryOperator {
    public static void main(String[] args) {

        //Example 1 Type code to check if an integer is even or odd

        int a = -22;
        String result1 = a%2==0 ? "Even" : "Odd" ;
        System.out.println(result1);

        // Type a code to check if an integer has 3 digits or not

        int b = 43565;
        String result2 = b>99 && b<1000 ? "The integer has 3 digits" : "The integer does not have 3 digits";
        System.out.println(result2);

        //Type code to calculate absolute value of a number
        double c = -23;
        double result3 = c<0 ? -1*c : c ;
        System.out.println(result3);

        double d = 27;
        double result4 = d<0 ? -1*d : d ;
        System.out.println(result4);

        //Type code to find the multiplication of two integers if the signs are same
        //give a message like I dont know how to multiply if the signs are different

        int e = 12;
        int f = 5;

        Object result5 = (e<0 && f<0) || (e>0 && f>0) ? e*f : "I do not know how to multiply";
        System.out.println(result5);






    }
}
