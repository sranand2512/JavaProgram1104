package April.ex_20042024;

public class L066_maxmin_ter_op {
    public static void main(String[] args) {
        int a = 30;
        int b = 20;

        int max = a < b ? b  : a;
        int min = a < b ? a  : b;

        System.out.println(max);
        System.out.println(min);


    }
}
