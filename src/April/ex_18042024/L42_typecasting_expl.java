package April.ex_18042024;

public class L42_typecasting_expl {
    public static void main(String[] args) {
        int a = 300;
        byte b = (byte)a; // here JVM is not able to create this into byte because it smaller bucket but if you still want it
        // then you need to mention it explicitly and it will crete but with some data loss.

        System.out.println(b);

    }
}
