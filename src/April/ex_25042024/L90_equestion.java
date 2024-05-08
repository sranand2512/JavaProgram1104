package April.ex_25042024;

import java.util.Scanner;

public class L90_equestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of x");
        double x = sc.nextDouble();

        System.out.println("Enter the values of y");
        double y = sc.nextDouble();

        System.out.println("Enter the values of z");
        double z = sc.nextDouble();

        double result;

        result = Math.cbrt((Math.pow(x,2)+Math.pow(y,2) - Math.abs(z)));
        System.out.println(result);

        sc.close();
    }
}
