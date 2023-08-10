package day08while_loop_do_while_loop;

public class C03DoWhileLoop {
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

        int sum1 = 0;
        for(int a=7; a<11; a++){
            sum1 = sum1 + a;;
        }

        System.out.println(sum1);

        int sum2 = 0;
        int b=3;

        while(b<11){
            sum2 = sum2 + b;

            b++;

        }
        System.out.println(sum2);

        int sum3 = 0;
        int c =7;

        do{
            sum3 = sum3 + c;

            c++;
        }while(c<11);
        System.out.println(sum3);

    }
}
