package April.ex_25042024;

public class L93 {
    public static void main(String[] args) {
        int a = 9;
        // if we want to use default as 1st case then we need to use break
        // double default can not be used in program
        switch (a){
            default:
                System.out.println("Noting find");
                break;
            case 10:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
            case 8:
                System.out.println("8");
        }
    }
}
