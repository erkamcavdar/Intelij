package day07loops;

public class C01Review {
    public static void main(String[] args) {

        //Example 1: Type code to print even integers from 5 to 16 on the console.

        for(int i=5; i<16; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //homework: Type code to print odd integers from 15 to 6 on the console
        for(int i=15; i>6; i--){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Example 2:Type code to print integers from 5 to 16 on the console except 7

        for(int i =5; i<17; i++){
            if(i!=7){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        for(int i=5; i<17; i++ ){
            if(i==7){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();


        //Example 3: Print String characters one by one on the console if you see x stop printing
        // "I like extra effort"
        String s = "I like Extra effort";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='x'){
                break;
            }
            System.out.print(s.charAt(i));
        }
        System.out.println();

        //Example 3: Print String characters one by one on the console if you see x stop printing

        String s1 = "I love Kubra so much";
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i)=='u'){
                break;
            }
            System.out.print(s1.charAt(i));
        }
    }
}
