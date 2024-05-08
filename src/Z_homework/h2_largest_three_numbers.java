package Z_homework;

import java.util.Scanner;

public class h2_largest_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 1st Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter your 2nd Number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter your 3rd Number: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1> num3) {
            System.out.println(num1 + "is Greater.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + "is Greater.");

        }else {
            System.out.println(num3+ "is Greater. ");
        }
    }
}
