package ex_05_Ternary_Operator;

public class Lab041_Classify_Age_Example {
    public static void main(String[] args) {
        //Age = 23, user has to classify if the person is a minor(Age<18),An adult(Age>18) or a senior(Age>60)

        int age=59;
        //result = condition ? expression1 : expression2
        String answer=(age<18) ? "Minor" : (age<60) ? "Adult" :"Senior";
        System.out.println(answer);
    }
}
