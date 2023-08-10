package day05ternarystatement_stringmanipulations;

public class C01Review {
    public static void main(String[] args) {


        //Example 1 Type code to check if an integer is even or odd

        int i =24;
        String result1 = i%2==0 ? "Even" : "Odd";
        System.out.println(result1);

        // Type a code to check if an integer has 3 digits or not

        int a =23433;
        String result2 = a>99 && a<1000 ? "The integer has 3 digits" : "The integer does not have 3 digits";
        System.out.println(result2);


        //Type code to calculate absolute value of a number

        double b = -29;
        double result3 = b<0 ? -1*b : b;
        System.out.println(result3);

        //Type code to find the multiplication of two integers if the signs are same
        //give a message like I dont know how to multiply if the signs are different

        int e = -5;
        int f = -4;
        Object result4 = (e<0 && f<0) || (e>0 && f>0) ? e*f : "I dont know how to multiply...";
        System.out.println(result4);


        //Type code to find the addition of two integers if the signs are same
        //give a message like I dont know how to multiply if the signs are different


        int q =67;
        int w =85;

        Object result5 = (q<0 && w<0) || (q>0 && w>0) ? q+w : "What the hell";
        System.out.println(result5);

        //Type code to calculate absolute value of a number

        double z = -99.99;
        double result6= z<0 ? z*-1: z;
        System.out.println(result6);
    }
}
