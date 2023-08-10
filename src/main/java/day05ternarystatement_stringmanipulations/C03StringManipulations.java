package day05ternarystatement_stringmanipulations;

public class C03StringManipulations {

    public static void main(String[] args) {


        //Exaple 1: count the alphabetical characters in a given String
        //Tom Hanks!...

        //Remove the non-alphabetical characters

        //If we want to work with a group of data we use "regular expression" (Regex)

        /*
        i) Upper case letters: A-Z
        ii) Lower case letters: a-z
        iii) All letters: [A-Za-z]
        iv) All digits: [8-9 ]
        v) Letters from m to v: [n-v]
        vi) Regex for a,b,e,d,g,z [abedgz]

        a)All characters different from uppercase letters: [^A-Z]
        b)All characters different from lowercase letters: [^a-z]
        c)All characters different from all letters: [^A-Za_z]
        d)All characters different from digits: [^0-9]
        e)All symbols different from letter and digits: [^A-Za-z0-9]
        f)All punctuations: \\p{Punct}
         */

        //1. Step remove the non alphabetical characters.

        String s1= "Tom Hanks!...";
        int numOfChar= s1.replaceAll("[^A-Za-z]", "").length();
        System.out.println(numOfChar);



        //replaceAll() it removes a group of data(regex) puts thr required characters in place of them
        //length() counts the number of characters in String

        //Example 2 Type code to change all digits to * in a given password
        //          a12b32c
        String pwd= "a12b32c";
        System.out.println("pwd =" + pwd);

        String hiddenPwd= pwd.replaceAll("[0-9]", "*");
        System.out.println("hiddenPwd = " + hiddenPwd);

        //Example 3: Get initials from a full name (Middle name is out of scope
        //Tom Hanks
        
        
        String name = "   tOm HAnks    ";

        //trim()   removes extra space from the beginning and from the end of a String value

        System.out.println("name = " + name);

        String firstInitial = name.trim().substring(0,1).toUpperCase();
        System.out.println("firstInitial = " + firstInitial);

        String lastInitial = name.trim().split(" ")[1].substring(0, 1).toUpperCase();
        System.out.println("lastInitial = " + lastInitial);
    }
}
