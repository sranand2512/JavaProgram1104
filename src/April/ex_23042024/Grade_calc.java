package April.ex_23042024;

import java.util.Scanner;

public class Grade_calc {
    public static void main(String[] args) {

        System.out.println("Enter the Number Obtained :");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        char grade = 'F';

        if(num >= 90 && num <100){
            grade = 'A';

        }
        System.out.println("Your grade is : " + grade);
    }
}
