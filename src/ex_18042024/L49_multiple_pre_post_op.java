package ex_18042024;

public class L49_multiple_pre_post_op {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        // Part 1 -> ++a, E1 = 11, a = 11
        // Part 1 -> a++, E2 = 11, a = 12
        // Part 1 -> a++, E3 = 12, a = 13

    }
}
