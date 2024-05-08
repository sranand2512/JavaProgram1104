package April.ex_27042024;

import java.util.Scanner;

public class L094_positive_negative {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number which you want to check: ");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Number is Negative");
            } else if (num > 0) {
                System.out.println("Number is Positive");

            } else {
                System.out.println("Number is Zero");
            }
        }
    }

