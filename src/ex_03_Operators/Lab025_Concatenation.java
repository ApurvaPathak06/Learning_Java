package ex_03_Operators;

public class Lab025_Concatenation {

    public static void main(String[] args) {
        //Interview questions =

        /* Example 1 for concat
        String s1="Apurva";
        String s2="Pathak";
        String result=s1+s2;
        System.out.println(result); */

        //Example 2
        String s1="Apurva";
        String s2="Pathak";
        int a=10;
        int b=10;

        System.out.println(s1+s2+a+b); //concatenate everything
        System.out.println(s1+s2+(a+b)); //concatenate strings but adds integers
        System.out.println(a+b+s1+s2); //add integers then concats strings
        System.out.println(s1+a+b+s2); //concats everything
    }
}
