package Z_homework;

import java.util.Scanner;

public class h1_math_question {
    public static void main(String[] args) {
        // calculate cube root (x^2 + y^2 + |z|)
        System.out.println("Enter the value of X :");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        System.out.println("Enter the value of Y :");
        double y = sc.nextDouble();

        System.out.println("Enter the value of Z :");
        double z = sc.nextDouble();

        double z_r = Math.abs(z);
        double y_r = y*y;
        double x_r = x*x;


        double result = (x_r +y_r - z_r );

        double result1 = Math.cbrt(result);

        System.out.println(" Value of cube root (x^2 + y^2 + |z|) is " + result1);


    }
}
