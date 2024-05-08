package April.ex_20042024;

public class L058_IO_String_area_pool {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "Guys";
        String s3 = "hello Guys";

        // Here three string will be created in String constant pool but none in OA

        String s4 = s1.concat(s2);
        System.out.println(s4);
    }
}
