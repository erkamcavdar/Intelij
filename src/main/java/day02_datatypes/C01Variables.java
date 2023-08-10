package day02_datatypes;

public class C01Variables {

    public static void main(String[] args) {

        byte stAge = 25;
        System.out.println(stAge);

        short numOfStInHighSchool = 3245;
        System.out.println(numOfStInHighSchool);

        int populationOfMiami = 1200000;
        System.out.println(populationOfMiami);

        //If you create "long" variable, use "L" at the end of the value when the value is out of "int range"

        long populationOfTheWorld = 7000000000L;
        System.out.println(populationOfTheWorld);

        //If you create "long" variable, no need to use "L" at the end of the value when the value is out of "int range"
        int populationOfChina = 1500000000;
        System.out.println(populationOfChina);

        float shirtPrice = 23.99F;
        System.out.println(shirtPrice);

        double weightOfAHumanCell = 0.000000012;
        System.out.println(weightOfAHumanCell);

        boolean isRetired = false;
        System.out.println(isRetired);

        char letter = 'A';
        System.out.println(letter);

        String stName = "Mark Twain";
        System.out.println(stName);

    }


}