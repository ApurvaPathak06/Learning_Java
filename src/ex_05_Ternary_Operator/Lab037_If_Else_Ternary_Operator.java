package ex_05_Ternary_Operator;

public class Lab037_If_Else_Ternary_Operator {
    public static void main(String[] args) {
        // result = condition ? expression1 : expression2

        int age=15;
        String can_I_vote = age >18 ? "Yes, you can !!" : "Oops, you cannot";
        System.out.println(can_I_vote);
    }
}
