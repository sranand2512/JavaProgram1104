package April.ex_25042024;

import java.util.Scanner;

public class L81_switch_reallife {
    public static void main(String[] args) {
        // In web automation
        // we will ask the user for which browser he want me to run the code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of browser !!, where you want to execute the program: ");

        String browser_name = sc.nextLine();
        browser_name = browser_name.toLowerCase();

        switch (browser_name){
            case "chrome":
                System.out.println("Starting the chrome");
                //line of selenium code
                // that will probable written after some time.
                break;
            case "firefox":
                System.out.println("Starting the firefox");
                //line of selenium code
                // that will probable written after some time.
                break;
            case "eadge":
                System.out.println("Starting the eadge");
                //line of selenium code
                // that will probable written after some time.
                break;
            default:
                System.out.println("Browser is not supported");



        }


    }
}
