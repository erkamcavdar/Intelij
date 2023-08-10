package day06string_manipulations_loops;

public class C05Review {
    public static void main(String[] args) {



        //Example 6: Type a code to find the number of punctuation marks used in a String.
        // Wooow!... Toms is 13, amd he is in universtiy...
        String s = "Wooow!... Toms is 13, and he is in university.";
        int numOfPuncts = s.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(numOfPuncts);

        //Example 7: Type a code to find the number of words used in a String
        //           "Learn Java, earn huge amount of money." ==>7

        String a = "Learn Java, earn huge amount of money.";
        int numOfSpaces = a.replaceAll("[^ ]", "").length();
        System.out.println(numOfSpaces);

        System.out.println("Total number of words: " + (numOfSpaces + 1));


        int numOfWords = a.split(" ").length;
        System.out.println(numOfWords);

        //Example 8: Type a code to find the number of letters used in a String
        //           "Learn Java, earn huge amount of money." ==>30

        int numOfLetters = a.replaceAll("[^A-Za-z]", "").length();
        System.out.println(numOfLetters);


    }
}
