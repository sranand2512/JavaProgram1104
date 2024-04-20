package ex_18042024;

public class L43_IQ_typecasting {
    public static void main(String[] args) {
        int course_fee = 1000;
        float GST = 18.20f;
        double total = course_fee+(int)GST;
        System.out.println(total);
    }
}
