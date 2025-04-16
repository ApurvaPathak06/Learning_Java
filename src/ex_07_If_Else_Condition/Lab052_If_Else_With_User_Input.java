package ex_07_If_Else_Condition;

import java.util.Scanner;

public class Lab052_If_Else_With_User_Input {
    public static void main(String[] args) {
        //How to take user input
        //Method 1 -> CLI Input
        int age=Integer.parseInt(args[0]);
        System.out.println("User age is :" +age);

        //Method 2 -> Scanner Class
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your age");
        int age1 = scanner.nextInt();
        System.out.println("User entered age as:" +age1);

        if (age1>18){
            System.out.println("Going to GOA...!!!");
        }else {
            System.out.println("Staying home :(");
        }


    }
}
