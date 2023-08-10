package day05ternarystatement_stringmanipulations;

public class C03Review {
    public static void main(String[] args) {

        //Exaple 1: count the alphabetical characters in a given String
        //Tom Hanks!...

        String m = "Tom12 Hanks!...";
        int numOfChar = m.replaceAll("[^A-za-z]", "").length();
        System.out.println(numOfChar);




        String s9 = "Ben 436 seni cok sevi4t3utum...@#(1";
        int numOfChar1 = s9.replaceAll("[^0-9]", "").length();
        System.out.println(numOfChar1);


        String s8 = "isdflj4364#$%*^&^5w9efw own3848  38939 3ih";
        int result3 = s8.replaceAll("[^A-za-z]", "").length();
        System.out.println(result3);

        //Example 3: Get initials from a full name (Middle name is out of scope
        //Tom Hanks

        String s = " Tom Hanks ";
        String firsInitial = s.trim().substring(0,1).toUpperCase();
        System.out.println("First Initial: " + firsInitial);
        String lastInitial = s.trim().split(" ")[1].substring(0,1).toUpperCase();
        System.out.println("Secon Initial: " + lastInitial);

        //Example 2 Type code to change all digits to * in a given password

        String pwd = "a12b32c";

        String pwd1 = pwd.replaceAll("[0-9]", "*");
        System.out.println("Hidden Password: " + pwd1);






    }
}
