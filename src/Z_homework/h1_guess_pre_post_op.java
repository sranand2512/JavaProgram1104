package Z_homework;

public class h1_guess_pre_post_op {
    public static void main(String[] args) {
        int a = 10;
        a = ++a;
        System.out.println(a);
        a = a++;
        System.out.println(a);
        a = a+ a++;
        System.out.println(a);

        System.out.println(++a + a++ + a++);

    }
}
