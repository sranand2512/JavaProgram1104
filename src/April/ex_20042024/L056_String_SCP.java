package April.ex_20042024;

public class L056_String_SCP {
    public static void main(String[] args) {
        String name = " TheTestingAcademy";
        String name2 = " TheTestingAcademy";
        // this scenario only 1 string is crated and both name and name2 wil referer it to same string
        // but when we change the simple letter like "TheTestingAcademY" "Y" in caps then it will create a new string

        String name3 = new String("TheTestingAcademy");

        // here now 2 string will be created one in pool and in OA ie heap area.
    }

}
