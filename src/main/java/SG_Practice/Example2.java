package SG_Practice;

public class Example2 {
    public static void main(String[] args) {

        //Example 2: Find how many integers greater than 1 and less than 112 divide 112 evenly

        int a =0;
        for(int i=2; i<112; i++){
            if(112%i==0){
                a=a+1;
            }
        }
        System.out.println(a);

        //Example 3: Find how many vowels are in the string S.

        int count =0;
        String S = "Java is good";

        for(int i=0; i< S.length(); i++){
            if("aeio".indexOf(S.charAt(i)) !=-1){
                count = count+1;
            }
        }
        System.out.println(count);
    }
}
