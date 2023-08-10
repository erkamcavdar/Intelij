package day08while_loop_do_while_loop;

public class C02WhileLoop {
    public static void main(String[] args) {

        //Example 3: type code to find the sum of digits of a given integer
        // 587 ===> 5+8+7 ===> 20

        int i = 587;
        int sum=0;

        while(i>0){

            sum = sum + i%10;

            i = i/10;
        }
    }
}
