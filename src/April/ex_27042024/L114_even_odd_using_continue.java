package April.ex_27042024;

public class L114_even_odd_using_continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if(i%2 == 0){
                System.out.println("Even"+ i);
                continue;
            }
            System.out.println("Odd"+i);
        }
    }
}
