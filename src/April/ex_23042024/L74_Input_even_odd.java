package April.ex_23042024;

import java.util.Scanner;

public class L74_Input_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente your number");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
        sc.close();
    }
}
