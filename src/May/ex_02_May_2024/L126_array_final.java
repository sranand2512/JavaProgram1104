package May.ex_02_May_2024;

public class L126_array_final {
    public static void main(String[] args) {
        final int [] ages = new int [5];
        // here the final means the size can not be change not the content
        ages[3] = 75;
        ages[3] = 79;

        System.out.println(ages[3]);

        final int a = 10;
        // here the final means not changeable - byte, short, float, long, double, char, boolean means premitive
        // non primitive - string, array - size

    }
}
