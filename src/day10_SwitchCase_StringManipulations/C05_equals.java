package day10_SwitchCase_StringManipulations;

public class C05_equals {
    public static void main(String[] args) {
        String str1 = "Mehmet";
        String str2 = "MEHMET";
        String str3 ="mehmet";
        String str4 = "MEHmet";

        System.out.println(str1 ==str2); //false
        System.out.println(str3 == str4.toLowerCase());//false

        //stringlerde == her zaman doğru sonuç vermez.

        //Stringlerde equals qullanılır.

        System.out.println(str3.equals(str4.toLowerCase()));  //true

        //büyük küçük harfe dikkat etmeden mukayese et derseniz
        //equalsIgnoreCase kullan

        System.out.println(str1.equalsIgnoreCase(str2));  //true Mehmet MEHMET
        System.out.println(str1.equalsIgnoreCase(str3));  //true Mehmet mehmet
    }
}
