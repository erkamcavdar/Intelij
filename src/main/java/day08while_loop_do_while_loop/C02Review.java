package day08while_loop_do_while_loop;

public class C02Review {
    public static void main(String[] args) {

        //Example 3: type code to find the sum of digits of a given integer
        // 587 ===> 5+8+7 ===> 20

        int i = 587;
        int sumOfDigits = 0;

        while(i>0){
            sumOfDigits = sumOfDigits + i%10;

            i=i/10;
        }
        System.out.println(sumOfDigits);
        System.out.println();

        //Type code to create multiplication for the given integer.
        //      3==>  3x1=3  3x2=6  3x3=9   3x9=27  3x10=30

        int k = 1;
        int number = 3;
        while(k<11){
            System.out.println(number + "x" + k + "=" + (number*k));

            k++;
        }






    }
}
