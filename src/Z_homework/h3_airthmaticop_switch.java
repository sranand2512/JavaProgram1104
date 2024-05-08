package Z_homework;

import java.util.Scanner;

public class h3_airthmaticop_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number one :");
        int num1 = sc.nextInt();

        System.out.println("Enter the second one :");
        int num2 = sc.nextInt();

        System.out.println("Enter the Operation + , -, *, /,% ");
        char operation = sc.next().charAt(0);

        switch (operation){
            case '+' :
                System.out.println(num1+num2);
                break;
            case '-' :
                System.out.println(num1-num2);
                break;
            case '*' :
                System.out.println(num1*num2);
                break;
            case '/' :
                System.out.println(num1/num2);
                break;
            case '%' :
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Operation is not possible");

                sc.close();
        }


    }
}
