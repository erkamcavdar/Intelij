package day08while_loop_do_while_loop;

import java.util.Scanner;

public class C04DoWhileLoop {
    public static void main(String[] args) {



        //Ask user to enter an integer
        //If integer is less than 100 tell user "Won"
        //Otherwise tell user "Lost"

        Scanner input = new Scanner(System.in);
//        int i= 0;
//
//        do{
//            System.out.println("Enter an Integer...");
//            i = input.nextInt();
//            if(i<100){
//                System.out.println("Win");
//            }
//        }while(i<100);
//
//        System.out.println("Lost");

        int k=0;

        do{
            System.out.println("Enter an Integer...");
            k = input.nextInt();
            if(k>99){
                System.out.println("Lost");
                break;
            }else{
                System.out.println("Won");
            }

        }while(true);


    }
}
