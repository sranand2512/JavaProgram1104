package April.ex_20042024;

public class L064 {
    public static void main(String[] args) {
        String password = "Same@123";
        String pass_enter = password.toLowerCase();
        System.out.println(password == pass_enter);
        System.out.println(password.equals(pass_enter));
        System.out.println(password.equalsIgnoreCase(pass_enter));

        System.out.println(password.substring(0,4));
        System.out.println(password.indexOf("S"));

    }
}