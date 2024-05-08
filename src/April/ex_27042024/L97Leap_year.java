package April.ex_27042024;

import java.util.Scanner;

public class L97Leap_year {
    public static void main(String[] args) {
        System.out.println("Enter the year which you want to check :");
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        if((year%4 == 0 && year%100 != 0)  || (year%400 ==0)){
            System.out.println("Year is leap");
        }else {
            System.out.println("year in non leap");
        }
    }
}
