package ex_04_Typecasting;

public class Lab035_Narrowing_Explicit {
    public static void main(String[] args) {
        int value=200;
        byte b=(byte) value;
        //This is narrowing explicit casting & it is allowed
        System.out.println(b);
    }
}
