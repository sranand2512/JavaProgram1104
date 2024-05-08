package April.ex_20042024;

public class L055_immutability {
    public static void main(String[] args) {
        String s1 = " Kumar";
        String s2 = s1;
        System.out.println(s2);

        System.out.println("___");

        String s3 = "TheTestingAcadmy";
        s3.toLowerCase(); // here it is done lowercase but not assign to s3, so it will not print the value in lowercase.
        s3 = s3.toLowerCase(); // now it is assigned to s3 and print the same.
        System.out.println(s3);

    }
}
