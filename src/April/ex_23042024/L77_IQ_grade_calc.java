package April.ex_23042024;

import java.util.Scanner;

public class L77_IQ_grade_calc {
    public static void main(String[] args) {
        // grade calculator
        // A : 90- 100
        // B : 80- 89
        // C : 70- 79
        // D : 60- 69
        // F : 0- 59
        System.out.println("Please Enter Your Number Obtained in Class :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char grade = 'F';

        if (num >= 90 && num < 100){
           // System.out.println("Hey Congratulation, You have Obtained the A Grade");
            grade = 'A';

        } else if (num >= 80 && num < 90) {
           // System.out.println("Hey Congratulation, You have Obtained the B Grade");
            grade = 'B';

        } else if (num >= 70 && num < 80) {
          //  System.out.println("Hey Congratulation, You have Obtained the C Grade");
            grade = 'C';

        } else if (num >= 60 && num < 70) {
          //  System.out.println("Hey Congratulation, You have Obtained the D Grade");
            grade = 'D';

        } else if (num > 100) {
            System.out.println("Bhaii GOD h tu ");

        } else {
            System.out.println("Better luck Next time, Try again");
            grade = 'F';



        }
        System.out.println("Your Grade obtained is : " + grade);

    }
}
