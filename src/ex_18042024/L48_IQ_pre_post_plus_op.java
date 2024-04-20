package ex_18042024;

public class L48_IQ_pre_post_plus_op {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a + ++a);
        // here devide this into three part
        // Part A -> ++a, Er= 11, a = 11
        // Part B -> +
        // Part C -> ++a, Er= 12, a = 12


       int b= 10;
       System.out.println(++b + b++);

    }
}
