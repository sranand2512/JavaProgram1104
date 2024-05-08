package May;

import java.util.Scanner;

public class L132 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];

        System.out.println("Enter the sub1 marks : ");
        marks[0] = sc.nextFloat();

        System.out.println("Enter the sub1 marks : ");
        marks[1] = sc.nextFloat();

        System.out.println("Enter the sub2 marks : ");
        marks[2] = sc.nextFloat();

        System.out.println("Enter the sub3 marks : ");
        marks[3] = sc.nextFloat();

        System.out.println("Enter the sub4 marks : ");
        marks[4] = sc.nextFloat();

//        for(int i =0 ; i < marks.length; i++){
//            if (marks[i] <30){
//                System.out.println("Your failed in : " + marks[i]);
//            }
//            System.out.println(marks[i]);
//        }

        int j =0;
        while (j<marks.length){
            System.out.println(marks[j]);
            j++;
        }


    }
}
