package day13_string_builder_string_buffer;

public class C01StringBuilder {

    public static void main(String[] args) {

        /*
        There are 3 classes to store strings
        String, StringBuilder,StringBuffer

        Why did Java create 3 classes to create Strings?
        1)String class is "Immutable" String Builders is "mutable"
         */

        String s = "Java";
        String t = "Java";
        String u = "Apex";

        s = s + "!";
        System.out.println(s);
        System.out.println(t);

        StringBuilder v = new StringBuilder("Python");
        System.out.println(v);

        v.append("!");//is like concat() --> append() adds character to the end of the StringBuilder object
        System.out.println(v);

        StringBuilder x = new StringBuilder("Ruby");
        System.out.println(x);

        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        sb.append("Hi! ").append("Java!...");
        System.out.println(sb);
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//12

        StringBuilder stateAbbr = new StringBuilder(2);//If we define some more characters to be added that is having a greater number
                                                               //New Capacity --> Existing/Identified Cap Num * 2 +2
        stateAbbr.append("FL").append("How").append("Jack");
        System.out.println(stateAbbr);
        System.out.println(stateAbbr.capacity());//6
        System.out.println(stateAbbr.length());//5

        sb.reverse();
        System.out.println(sb);

        sb.replace(0,4,"*");
        System.out.println(sb);

        sb.insert(5,"123");
        System.out.println(sb);

        sb.delete(5,8);
        System.out.println(sb);

        sb.deleteCharAt(6);
        System.out.println(sb);

        StringBuilder a= new StringBuilder("Nava");
        StringBuilder b= new StringBuilder("Lava");

        int r= a.compareTo(b);//compareTo() method compares the first characters of the given container values.
                              // If the compared containers first char is before the second given containers first char in alphabetical order
                              // you will receive negative values.
        System.out.println(r);

        a.setCharAt(2,'n');
        System.out.println(a);

        //Methods in StringBuffer

        StringBuffer sbf= new StringBuffer("Python");

        System.out.println(sbf.subSequence(2,4));//th
        System.out.println(sbf);



    }
}
