package April.ex_25042024;

public class L89_switch_return_yield {
    public static void main(String[] args) {
        char code ='A';
        int val = switch (code){
            case 'A':
                yield 65;
            case 'B':
                yield 66;
            default:
                System.out.println("Unable to find");
             throw new IllegalStateException("Error");
        };
        System.out.println(val);

    }
}
