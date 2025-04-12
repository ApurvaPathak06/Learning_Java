package ex_05_Ternary_Operator;

public class Lab040_Highest_Among_Three_Numbers {
    public static void main(String[] args) {
        //Find the highest number among three numbers

        int n1=10;
        int n2=-20;
        int n3=35;
// if n1>n2 & n1>n3 then -> n1 is greater
// if n2>n3 & n2>n1 then -> n2 is greater
// if above two are false then by default n3 is greater

        int max = (n1>n2) ? (n1>n3) ? n1:n3 : ((n2>n3) ?n2 :n3);
        //result = condition ? expression1 : expression2
        System.out.println("Largest number is "+max);
    }
}
