package ex_06_Increment_Decrement_Op;

public class Lab045_Advance_Increment_Example2 {
    public static void main(String[] args) {
        int a=10;
       //Example 1
        System.out.println(a++ + ++a);
        //original 10(incremented to 11) +here 11 got incremented to 12(12 remain 12) ->total 22
        System.out.println(a);
        // 12

        //Example 2
        int b=10;
        System.out.println(++b + ++b);
        System.out.println(b);

    }
}
