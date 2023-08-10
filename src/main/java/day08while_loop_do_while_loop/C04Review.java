package day08while_loop_do_while_loop;

import java.util.Scanner;

public class C04Review {
    public static void main(String[] args) {

        //Ask user to enter an integer
        //If integer is less than 100 tell user "Won"
        //Otherwise tell user "Lost"

        Scanner s = new Scanner(System.in);
//        int i =0;
//
//        do{
//            System.out.println("Enter an Integer...");
//            i = s.nextInt();
//            if(i<100){
//                System.out.println("Won");
//            }
//        }while(i<100);
//        System.out.println("Lost");

        int k = 0;

        do{
            System.out.println("Enter an Integer...");
            k = s.nextInt();
            if(k>99){
                System.out.println("Lost");
                System.out.println("Thanks for playing");
                break;

            }else{
                System.out.println("Won");
            }
        }while(true);
    }
}
