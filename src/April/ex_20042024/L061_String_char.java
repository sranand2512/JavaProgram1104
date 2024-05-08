package April.ex_20042024;

public class L061_String_char {
    public static void main(String[] args) {
        String s1 = "Saurabh";
        char c = s1.charAt(0);
        System.out.println(c);

        boolean r = s1.contains("b");
        System.out.println(r);

        s1= s1.concat("Kumar");
        System.out.println(s1);
    }
}
