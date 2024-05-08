package May.ex_02_May_2024;

public class L124_array2 {
    public static void main(String[] args) {
        int[] age = {25,36,45,25,12};
        // fixed elemnts

        int [] ages2 = new int[5];
        // case here default value will be zero and this is the better way to assign
        System.out.println(ages2[0]);

        ages2[0]= 56;
        System.out.println(ages2[0]);

        String[] breakfast = {"tea", "coffy", "idli"};
        System.out.println(breakfast.length);


    }
}
