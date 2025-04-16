package ex_08_Switch;

import java.util.Scanner;

public class Lab056_Without_Default_condition {
    public static void main(String[] args) {
        //Write a program to get the day as per the number entered
        //Ex : 1-> Monday, 5-> Friday, 8-> NA/Error

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number(Between 1-7)");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                //In this case no code will run for an invalid input
        }

    }
}
