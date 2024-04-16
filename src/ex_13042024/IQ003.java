package ex_13042024;

public class IQ003 {
    public static void main(String[] args) {
        int a = 25;
        int b = 10;
        System.out.println(a+b);

        String Fname = "Saurabh";
        String Lname = "Kumar";

        // in concatenation will always go  left -> right

        System.out.println(a+b+Fname); // a+ b add then concatenation
        System.out.println(a+Fname); // concatenation
        System.out.println(Fname+a+b);// concatenation


    }
}
