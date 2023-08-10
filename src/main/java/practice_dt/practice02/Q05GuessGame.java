package practice_dt.practice02;

import java.util.Scanner;

public class Q05GuessGame {
    /*
        Type code for a game that finds random numbers between 0 and 100
          Hint:
        If the number you entered is less than random number, print => Enter a greater number
        If the number you entered is greater than random number, print => Enter a smaller number
        If the number you entered is equal to the random number, print => Congratulations! You found the number
     */
    public static void main(String[] args) {

        //       System.out.println(Math.random()*100);
        //        System.out.println(0.999*101);

//        System.out.println((int)(Math.random()*101)); // returns random number between 0-1 where one is exclusive.
        int randomNumber = (int)(Math.random()*101);
      //  System.out.println("randomNumber " + randomNumber);

        Scanner scan = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 100");
        int number;

        int numOfAttempts = 5;

        do{
            numOfAttempts--;
            number =scan.nextInt();
            if(number < randomNumber){
                System.out.println("Enter a greater number");
            }else if(number > randomNumber){
                System.out.println("Enter a smaller number");
            }else{
                System.out.println("Congratulations! You found the number!!");
                break;
            }

            // Limit the number of attempts for the user

            if(numOfAttempts == 0){
                System.out.println("Sorry, you failed!! You couldn't guess the number");
                System.out.println("Continue : Y/N");
                String condition = scan.next();
                if(condition.equalsIgnoreCase("y")){
                    System.out.println("Guess a number between 0 and 100");
                    numOfAttempts = 5;
                    randomNumber = (int)(Math.random()*101);
                }else{
                    System.out.println("Thanks for playing");
                    break;
                }
            }
        }while(true);
    }

}
