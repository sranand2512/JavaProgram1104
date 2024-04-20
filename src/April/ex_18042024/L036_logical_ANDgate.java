package April.ex_18042024;

public class L036_logical_ANDgate {
    public static void main(String[] args) {
        // AND &&

        // T && T -> T
        // T && F -> F
        // F && T -> F
        // F && F -> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }
}
