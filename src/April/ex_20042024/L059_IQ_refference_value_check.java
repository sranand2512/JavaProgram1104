package April.ex_20042024;

public class L059_IQ_refference_value_check {
    public static void main(String[] args) {
        String name = "The Testing AcademY"; // stored in SCP
        String name1 = "The Testing Academy"; //stored in SCP
        String name2 = new String("The Testing AcademY"); //stored in OA or HA

        System.out.println(name == name1); // check the reference if it s equal or not
        System.out.println(name == name2); // check the reference if it s equal or not
        System.out.println(name.equals(name2)); // this will basically check if the values are equal or not
    }
}
