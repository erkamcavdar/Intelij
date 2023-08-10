package day08while_loop_do_while_loop;

public class C01WhileLoop {
    public static void main(String[] args) {



        //Type code to print even integers from 13 to 8
        int i = 13;

        while(i>7){

            if (i%2==0){
                System.out.print(i + " ");
            }

            i--;

        }

        //Infinite loop is a risk in using loops
        //If you forget to type increment or decrement part in loops you will have infinite loops and java will get stuck.
        //it means your application will freeeze
        //if you type it in a wrong way in loops you will have infinite loops it means the application is gonna freeze
        System.out.println();
        //Example Type code to check if a given integer is palindrome or not
        //      Polindrome: 121 ==> 121   123321 ==> 123321

        int k=-123321;
        k = Math.abs(k);
        String m = String.valueOf(k);
        int n= m.length()-1;

        String reversed= "";

        while(n>=0){

            reversed = reversed + m.charAt(n);

            n--;

        }
        System.out.print(reversed);


        System.out.println();
        if (m.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }



    }
}
