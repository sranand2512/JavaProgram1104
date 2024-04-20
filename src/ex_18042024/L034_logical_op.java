package ex_18042024;

public class L034_logical_op {
    public static void main(String[] args) {
        //Logical Operator
        //NOR, OR,AND gate

        boolean a = true;
        System.out.println(!a);
        System.out.println(!(10>20));
        System.out.println(!(30>90));
        System.out.println(!!(30>90));
        System.out.println(!!!!(30>90));
        System.out.println(!!!(30>90)); // we can add n number of negation
    }
}
