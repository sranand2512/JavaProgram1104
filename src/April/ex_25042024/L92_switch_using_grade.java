package April.ex_25042024;

import java.util.Scanner;

public class L92_switch_using_grade {
    public static void main(String[] args) {
        // Program to check the grade

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");

        int marks = sc.nextInt();
        marks = marks/10;

       // 10 -> 100/10 -> 10 -> A
       // 10 -> 87/10 -> 8-> B
       // 10 -> 75/10 -> 7 -> C

        switch (marks){
            case 9:
                System.out.println('A');
                break;
            case 8:
                System.out.println('B');
                break;
            case 7:
                System.out.println('C');
                break;
            case 6:
                System.out.println('D');
                break;
            default:
                System.out.println("sorry you are failed");

                sc.close();
        }


    }
}
