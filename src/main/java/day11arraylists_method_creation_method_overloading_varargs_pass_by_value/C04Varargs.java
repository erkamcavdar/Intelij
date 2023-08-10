package day11arraylists_method_creation_method_overloading_varargs_pass_by_value;

public class C04Varargs {
    public static void main(String[] args) {

        //Varargs stands for "Variable Arguments"
        //By using "Varargs", we made method working witf different number of arguments
        // "Varargs" uses "Array" behind, that is why when we use with "Varargs" think we are working with "Arrays"
        // You can not use any parameter after "Varargs" so "Varargs" must be the las parameter in a method
        //You can use parameter before "Varargs", because the parameter you used can be make full then "Varargs" will be reachable
        System.out.println(add());
        System.out.println(add(5));
        System.out.println(add(5,3));
        System.out.println(add(5,9,6,1,2,4,4,8,4,6,2,2,5,9));
    }

    //Create a method able to do addition with any number of parameters
    public static int add( int...a) {

        int sum = 0;

        for (int w : a) {
            sum = sum + w;
        }
        return sum;
    }
}
