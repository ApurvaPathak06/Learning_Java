package ex_06_Increment_Decrement_Op;

public class Lab050_CLI_Input_Task {
    public static void main(String[] args) {
        //Take a user input - Name, Age and Salary and print them in the end.

        String name=args[0];
        int age = Integer.parseInt(args[1]);
        int salary = Integer.parseInt(args[2]);

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

    }
}
