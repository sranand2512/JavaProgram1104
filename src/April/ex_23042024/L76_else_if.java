package April.ex_23042024;

import java.util.Scanner;

public class L76_else_if {
    public static void main(String[] args) {
 //       System.out.println("Enter the Number :");
  //      Scanner sc = new Scanner(System.in);
   //     int number = sc.nextInt();
     //   if(number > 20){
       //     System.out.println(" Number is Greter than 20");
       // } else if (number > 10) {
       //     System.out.println("Number is in between 10 and 20");

      //  }else {
       //     System.out.println("Number is less than 20");
       // }
  //  }
        System.out.println("Enter the Number 1 :");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter the Number 2 :");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(" Number 1 ie "+num1+ " is greater");
        } else if (num1 == num2) {
            System.out.println(" Number 1 ie "+num1+ " and Number 2 ie "+num2+ " are equal");
        }else {
            System.out.println(" Number 2 ie "+num2+ " is greater");
        }

          sc.close();
        }
    }
