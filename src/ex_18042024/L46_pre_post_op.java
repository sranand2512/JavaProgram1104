package ex_18042024;

public class L46_pre_post_op {
    public static void main(String[] args) {
        // increment Operator
        // Pre and Post
        int a = 10;
        int result = a++;
        // here differentiate between a and result after every line.
        // like result is 10 and value of a = 11

        System.out.println(a);
        System.out.println(result);

        int b = 15;
        int result2 = ++b;

        System.out.println(b);
        System.out.println(result2);
    }
}
