package April.ex_27042024;

import java.util.Scanner;

public class L96_vowel_conso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your word: ");
        char c = sc.next().charAt(0);
      //  c = c.toLowerCase();
        if(c == 'a' || c == 'e' || c == 'i'|| c== 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'|| c== 'O' || c == 'U') {
            System.out.println("It is vowel");
        }else {
            System.out.println(" It is Consonant");
        }
    }
}
