package day08while_loop_do_while_loop;

import org.w3c.dom.ls.LSOutput;

public class C03Review {
    public static void main(String[] args) {


        // while-loop

        int i = 1;

        while (i < 1) {
            System.out.println("While loop");
            i++;
        }

        //do-while-loop

        int k = 1;

        do{
            System.out.println("Do while loop");
            k++;
        }while(k<1);



        //Reverse a String by using the while loop
        String s = "Erkam";
        String reversed = "";

        int t = s.length()-1;

        do{
            reversed = reversed + s.charAt(t);

            t--;

        }while(t>=0);
        System.out.println(reversed);

        //Type code to find the sum of the integers from 7 to 10

        int sum = 0;
        for (int n=7; n<11; n++){
            sum = sum + n;
        }
        System.out.println(sum);
        System.out.println();
        int sum2 = 0;
        int n=7;
        while(n<11){
            sum2 = sum2 + n;
            n++;
        }
        System.out.println(sum2);
        System.out.println();

        int sum3 = 0;
        int r = 7;
        do{
            sum3 = sum3 + r;
            r++;
        }while(r<11);
        System.out.println(sum3);
    }
}
