package day16oop;

public class C06StudentRunner {
    public static void main(String[] args) {


        C05Student std = new C05Student();
        System.out.println(std.getStdId()); //TH001
        System.out.println(std.getIllness()); //Headache
        System.out.println(std.getGpa()); // 3.9
        System.out.println(std.isDisability()); //false

        std.setStdId("SB001");
        System.out.println(std.getStdId());
        std.setIllness("Anxiety");
        System.out.println(std.getIllness());
        std.setGpa(2.5);
        System.out.println(std.getGpa());
        std.setDisability(true);
        System.out.println(std.isDisability());
    }
}
