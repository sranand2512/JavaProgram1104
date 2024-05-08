package May;

public class L125 {
    public static void main(String[] args) {
        int[]a= new int[5];
        // default = a|0,0,0,0,0|
        // JVM = |0,0,0,0|

        a[3]= 90;
    }
}
