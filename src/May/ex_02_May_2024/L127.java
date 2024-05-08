package May.ex_02_May_2024;

public class L127 {
    public static void main(String[] args) {
        // == -> check reference
        // .equal() -> values

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};

        System.out.println(arr1==arr2);

        int[] arr3 = arr1;
        System.out.println(arr1==arr3);
        System.out.println(arr1.equals(arr2));

        // in array
        // == -> check reference
        // .equal() -> values
        // they both check for reference only

        String s = " Baby";
        String s1 = " Baby";

        System.out.println(s.equals(s1)); // here it will check the content
    }
}
