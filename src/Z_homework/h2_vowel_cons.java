package Z_homework;

import java.util.Scanner;

public class h2_vowel_cons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your word: ");
        String c = sc.nextLine();

        c = c.toLowerCase();

        if(c == "a" || c == "e" || c == "i" || c== "o" || c == "u") {
            System.out.println("It is vowel");
        }else {
            System.out.println(" It is Consonant");
        }
    }
}
