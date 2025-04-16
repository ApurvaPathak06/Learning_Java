package ex_08_Switch;

import java.util.Scanner;

public class Lab057_Reallife_Web_Automation_Example {
    public static void main(String[] args) {
        //I will ask user to enter the browser which they want to use(Input),
        // I will use that browser to start automation
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser=scanner.next();

        switch (browser){
            case "chrome":
                System.out.println("Opening Chrome browser...");
                break;
            case "Firefox":
                System.out.println("Opening Firefox....");
                break;
            default:
                System.out.println("Don't know this browser...");






        }


    }

}
