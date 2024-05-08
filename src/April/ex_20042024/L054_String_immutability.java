package April.ex_20042024;

public class L054_String_immutability {
    public static void main(String[] args) {
        String name = "Saurabh"; // by this the name is created in area(storage) is called Sting constant pool.
        String name2 = new String("Saurabh");// by this the name is created in area(storage) are called OA Object Area

        //Immutable means that can not be change.
        // Strings are immutable, non-primitive date type in java.

        System.out.println(name);
        name = "Kumar";
        System.out.println(name);

    }
}
