package ex_06_Increment_Decrement_Op;

public class Lab042_Pre_Increment_Example {
    public static void main(String[] args) {
        //**Pre - increment -> ++a , operand.**
        // value is incremented first and then stored in the result.
        int a=10;
        int b=++a;
        System.out.println(b); //11
        System.out.println(a); //11
    }
}
