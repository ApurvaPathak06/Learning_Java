package ex_08_Switch;

import java.util.Scanner;

public class Lab055_Switch_Case_Without_Break {
    public static void main(String[] args) {
        //Write a program to get the day as per the number entered
        //Ex : 1-> Monday, 5-> Friday, 8-> NA/Error

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number(Between 1-7)");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid input..");
        }

    }
}
