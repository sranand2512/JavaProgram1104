package May.ex_02_May_2024;

public class L133_fizzbuzz {
    public static void main(String[] args) {
        for (int j = 1; j <=100 ; j++) {
            if (j%3 == 0 && j%5 ==0){
                System.out.println("FizzBuzz");
            } else if (j%3 == 0) {
                System.out.println("Fizz");

            } else if (j%5 ==0) {
                System.out.println("Buzz");

            } else {
                System.out.println(j);
            }

        }
    }
}
