package April.ex_25042024;

public class L86_multiplecase_one_case {
    public static void main(String[] args) {
        int code = 0;

        switch (code){
            case 01,03,05:
                System.out.println("data bw 001 - 005");
                break;
           case 07,11:
               System.out.println("data bw 007 - 011");
                break;
            default:
                System.out.println("default");
        }
    }
}
