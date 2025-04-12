package ex_04_Typecasting;

public class Lab036_Typecasting_Example {
    public static void main(String[] args) {
        int course =100;
        float GST= 18.25f;
        /*int total = course+GST; // Narrowing -> Implicit -> Not allowed
        System.out.println(total);*/

        int total1 = course+(int)GST; // Narrowing -> Explicit
        System.out.println(total1);

        float total2=course+GST; //widening -> Implicit
        System.out.println(total2);

        float total3 = (float)course+GST; // widening -> Explicit
        System.out.println(total3);


    }
}
