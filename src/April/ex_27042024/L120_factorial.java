package April.ex_27042024;

import java.util.Scanner;

public class L120_factorial {
    public static void main(String[] args) {
        // Factorial
        // 1 - 1
        // 2 -  1*2
        // 3 -  1*2*3

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        long fac = 1;
        for (int i = 1; i <= num ; i++) {

            fac = fac*i;

        }
        System.out.println(fac);
        sc.close();
    }
}
