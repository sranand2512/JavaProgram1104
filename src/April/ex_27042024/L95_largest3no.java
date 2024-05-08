package April.ex_27042024;

import java.util.Scanner;

public class L95_largest3no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 1st Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter your 2nd Number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter your 3rd Number: ");
        int num3 = sc.nextInt();

//        if(num1 > num2 && num1> num3) {
//            System.out.println(num1 + "is Greater.");
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println(num2 + "is Greater.");
//
//        }else {
//            System.out.println(num3+ "is Greater. ");
//            sc.close();
//        }

        int largest = (num1 > num2 ) ? ((num1>num3?num1:num3)):((num2>num3? num2:num3));
        System.out.println(largest);
    }
}
