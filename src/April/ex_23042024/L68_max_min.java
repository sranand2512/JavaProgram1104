package April.ex_23042024;

import java.util.Scanner;

public class L68_max_min {
    public static void main(String[] args) {

        // max min for three nos
        System.out.println("Enter your number 1 :");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter your number 2 :");
        int num2 = sc.nextInt();

        int max = Math.max(num1, num2);
        System.out.println("max by math dunc " + max);

    }
}
