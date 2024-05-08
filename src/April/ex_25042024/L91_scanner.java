package April.ex_25042024;

import java.util.Scanner;

public class L91_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String name = sc.nextLine();

        System.out.println("Enter Your Age:");
        int age = sc.nextInt();

        System.out.println("Enter Your Salary:");
        Double salary = sc.nextDouble();

        System.out.println("Your details are : \nName: "+ name +  " \nAge: " + age + "\nSalary: "+ salary);

        sc.close();

    }
}

