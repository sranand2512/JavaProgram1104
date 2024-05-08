package April.ex_20042024;

public class L050_impli_explic_typcasting {
    public static void main(String[] args) {
        byte a = 10;
        int b = a; // implicit TC and done by JVM

        int a1 = (int)b; // Explicit TC

    }
}
