package day07loops;

import java.util.Scanner;

public class C05Review {
    public static void main(String[] args) {


        //Example 9: Type code to print fibonacci numbers, the number of fibonacci will be given by user
        // User gave 6>>= 1 1 2 3 4 8 13 21 34


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci number you want to see...");
        int nfibo = input.nextInt();

        int fibo1 = 1;
        int fibo2 = 1;
        int fibo = 0;

        System.out.print(fibo1 + " ");
        System.out.print(fibo2 + " ");

        for(int i=1; i<nfibo-1; i++){
            fibo = fibo1 +fibo2;
            fibo1 = fibo2;
            fibo2 = fibo;

            System.out.print(fibo + " ");
        }



    }
}
