package ex_18042024;

public class L44_incr_dcrm_op {
    public static void main(String[] args) {

// pre, post

        int a = 10;
        int b = ++a; // a = a+1
        // pre -> value is incremented first then the result computed.
        System.out.println(b);
        System.out.println(a);
    }
}
