package April.ex_25042024;

import java.util.Scanner;

public class L82_switch_reallife2 {
    public static void main(String[] args) {
        // take user input and show case it is vowel

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char, to know it is vowel and consonant");

        char user_input = sc.next().charAt(0);

        switch(user_input){
            case 'a':
                System.out.println("It is vowel");
                break;
            case 'e':
                System.out.println("It is vowel");
                break;
            case 'i':
                System.out.println("It is vowel");
                break;
            case 'o':
                System.out.println("It is vowel");
                break;
            case 'u':
                System.out.println("It is vowel");
                break;
            default:
                System.out.println("It is consonant");
        }
        sc.close();
    }
}
