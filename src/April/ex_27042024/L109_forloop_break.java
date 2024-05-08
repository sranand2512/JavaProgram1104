package April.ex_27042024;

public class L109_forloop_break {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
           // this will run 1 to 10
            if (i == 5) {
                break;
                // after break statement program will not run
            }
            System.out.println(i);
        }
    }
}
