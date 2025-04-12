package ex_04_Typecasting;

public class Lab032_Widening_Implicit {
    public static void main(String[] args) {
        //Typecasting is converting a value from one data type to another
        /*###Implicit Widening
        byte b = 10;
        int a = b; This is valid -> Implicit Casting - Widening

        ###Explicit Widening:not necessary, you can also perform explicit widening casting:
        byte b  = 10;
        int a1 = (int)b;This is Valid -> Explicit Casting` */

        byte b=10;
        int a=b;
        System.out.println(a);
    }
}
