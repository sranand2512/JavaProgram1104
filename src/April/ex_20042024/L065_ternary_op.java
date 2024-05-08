package April.ex_20042024;

public class L065_ternary_op {
    public static void main(String[] args) {
        boolean result = 10>40 ? 10>40 : 40>10;
        System.out.println(result);

        int a = true ? 10:20;
        int a1 = (30>40) ? 10 : 20;
        System.out.println(a1);

        String str = 10 <20? "10": "twenty";
        System.out.println(str);
    }
}
