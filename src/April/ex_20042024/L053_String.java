package April.ex_20042024;

public class L053_String {
    public static void main(String[] args) {

        String name = "Saurabh";
        // Assignment operator
        String name2 = new String("Saurabh"); // New operator

        // Both of them save the name but in different ways in JVM

        System.out.println(name);
        System.out.println("My name is"+name);
        System.out.printf("My name is %s",name);


        System.out.println(name.length());
        System.out.println(name.toLowerCase());

        int a = 65;
        System.out.println(a);
        char q = 'B';
        System.out.println(q);


        /*
         Primitive data type - byte, int, long, short, double, float, char, boolean
         All of them have extra functionality with them ie why it is a class
         Non-primitive data type - String,
         OOPS -
        */

    }
}
