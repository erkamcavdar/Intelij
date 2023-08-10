package day07loops;

public class C02Review {
    public static void main(String[] args) {


        //Example 4: Type code to reverse a String (Interview Quesion)
        // Alexa >>> axelA
        String s = "Alexa";
        String reversed = "";

        for( int i =s.length()-1; i>=0; i--){
            reversed = reversed + s.charAt(i);
        }
        System.out.println(reversed);


        String s1 = "My name is Erkam";
        String reverse = "";

        for(int r=s1.length()-1; r>=0; r--){
            reverse = reverse + s1.charAt(r);
        }
        System.out.println(reverse);


        // Example: Type code to find the sum of the digits in an integer
        // 587 ==> 5+8+7 = 20

        int num = 587;
        int sumOfDigits = 0;
        num = Math.abs(num);

        for(int i = num; i>0; i=i/10){
            sumOfDigits = sumOfDigits + i%10;

        }

        System.out.println(sumOfDigits);



        int num1 = -111;
        int sumOfDigits1= 0;

        num1 = Math.abs(num1);
        for(int i= num1; i>0; i=i/10){
            sumOfDigits1 = sumOfDigits1 + i%10;
        }
        System.out.println(sumOfDigits1);

        //Example 6: Type code to find unique characters in a String
        //Hello ==> Heo

        String t = "Hello";
        String unique = "";

        for( int i=0; i<t.length(); i++){

            char ch = t.charAt(i);

            if(t.indexOf(ch) == t.lastIndexOf(ch)) {
                unique = unique + ch;
            }
        }
        System.out.println(unique);


    }
}
