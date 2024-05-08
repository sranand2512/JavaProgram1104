package April.ex_25042024;

import java.util.Scanner;

public class L80_switch_break {
    public static void main(String[] args) {
        // if else - condition (if, else if, else) - multiple condition.
        // switch is also used for multiple condition handling.

        //1 - Mon, 2- tue, 3- wed, 4-thur, 5- fri, 6- sat, 7- sun

        // create a program to show the days according to the number.

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the num between 1-7");
        int day = sc.nextInt();

        switch (day) {
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
            default:
                System.out.println("Please Enter the number between 1 to 7");
        }
        System.out.println("End of the program checker");
    }
}
