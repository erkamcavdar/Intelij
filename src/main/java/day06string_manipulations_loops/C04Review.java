package day06string_manipulations_loops;

public class C04Review {
    public static void main(String[] args) {

        //Example 5:  String shirtPrice = "$12.99";
        //            String bookPrice = "$35.99";
        //            Type code to find the sum of the shirt and book prices.

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        String newShirtPrice = shirtPrice.replace("$", "");
        System.out.println(newShirtPrice);
        String newBookPrice = bookPrice.replace("$", "");
        System.out.println(newBookPrice);

        double doubleShirtPrice = Double.valueOf(newShirtPrice);
        System.out.println(doubleShirtPrice);
        double doubleBookPrice = Double.valueOf(newBookPrice);
        System.out.println(doubleBookPrice);

        System.out.println("Total price = " + (doubleShirtPrice + doubleBookPrice));




    }
}
