package April.ex_23042024;

import java.util.Scanner;

public class L79_triangle {
    public static void main(String[] args) {
        // triangle classifier
        // by taking input from user you need to give the name of triangle.
        // all side equal = equilateral
        // two side equal = isosceles
        // no side equal = scalene

        System.out.println("Enter the 1st side of triangle : ");
        Scanner sc = new Scanner(System.in);
        int side1 = sc.nextInt();

        System.out.println("Enter the 2nd side of triangle : ");
        int side2 = sc.nextInt();

        System.out.println("Enter the 3rd side of triangle : ");
        int side3 = sc.nextInt();

        if (side1 == side2 && side1 == side3) {
            System.out.println("Triangle is Equilateral");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Triangle is Isosceles");

        } else {
            System.out.println("Triangle is Scalene");


        }
        sc.close();
    }
}
