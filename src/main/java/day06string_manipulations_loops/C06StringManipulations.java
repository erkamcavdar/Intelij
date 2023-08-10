package day06string_manipulations_loops;

public class C06StringManipulations {
    public static void main(String[] args) {


        String s = "Java is Java";
        //Other Methods
        boolean r1 = s.contains("v");
        System.out.println(r1);//true

        boolean r2 = s.contains("x");
        System.out.println(r2);//false

        boolean r3 = s.contains(" ");
        System.out.println(r3);//true

        boolean r4 = s.contains("t");
        System.out.println(r4);//false


        boolean r5 = s.startsWith("J");
        System.out.println(r5);//true

        boolean r6 = s.startsWith("j");
        System.out.println(r6);//false

        boolean r7 = s.endsWith("a");
        System.out.println(r7);//true

        char r8 = s.charAt(2);//if you want to get a single character in char data type use charAt()
        System.out.println(r8);//v

        String r9 = s.repeat(3);
        System.out.println(r9);//Java is JavaJava is JavaJava is Java
    }
}
