package ex_03_Operators;

public class Lab024_Logical_Operators {
    public static void main(String[] args) {
        // And(&&), OR(||), Not(!)
        boolean a=true;
        System.out.println(!a);
        System.out.println(!!a);

        boolean result=true || false;
        System.out.println(result);


        boolean result2= true && true;
        System.out.println("Answers is :"+result2);
    }
}
