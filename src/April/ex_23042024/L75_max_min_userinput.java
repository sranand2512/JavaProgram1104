package April.ex_23042024;

import java.util.Scanner;

public class L75_max_min_userinput {
    public static void main(String[] args) {
        System.out.println("Enter your number 1 :");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter your number 2 :");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1 +"is Max");
            System.out.println(num2 +"is Min");

        }else {
            System.out.println(num2 + "is Max ");
            System.out.println(num1 + "is Min ");
        }
        sc.close();
    }
}
