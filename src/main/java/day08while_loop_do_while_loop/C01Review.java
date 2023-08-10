package day08while_loop_do_while_loop;

public class C01Review {
    public static void main(String[] args) {

        //Type code to print even integers from 13 to 8


        int i = 13;
        while(i>7){

            if(i%2==0){
                System.out.print(i + " ");
            }
            i--;
        }
        System.out.println();

        //Example Type code to check if a given integer is palindrome or not
        //      Polindrome: 121 ==> 121   123321 ==> 123321 (Interview question)

        int k = -1234321;

        k = Math.abs(k);
        String m = String.valueOf(k);
        String reversed = "";
        int n = m.length()-1;

        while(n>=0){
            reversed = reversed + m.charAt(n);

            n--;
        }
        System.out.println(reversed);

        if(m.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }




    }
}
