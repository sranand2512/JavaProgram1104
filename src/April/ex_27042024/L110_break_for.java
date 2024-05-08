package April.ex_27042024;

public class L110_break_for {
    public static void main(String[] args) {
        System.out.println("Print the value of i, but i want to break when i == 5");

        for (int i = 1; i<= 10; i++){
            System.out.println("value of i: "+i);
            if(i==5){
                break;
            }
            System.out.println("Value of i: "+i);
        }

        System.out.println("End");
    }
}
