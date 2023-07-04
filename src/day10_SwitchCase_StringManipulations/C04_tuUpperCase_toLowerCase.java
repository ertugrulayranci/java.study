package day10_SwitchCase_StringManipulations;

import java.util.Locale;

public class C04_tuUpperCase_toLowerCase {
    public static void main(String[] args) {
        String str = "Java Candır";

        System.out.println(str.toUpperCase());

        str = str.toUpperCase(); //JAVA CANDIR;

        System.out.println(str.toLowerCase()); //Java Candir;

        //eğer yerel bir dile göre büyük küçük harf değişimi yapmak istersek

        str.toLowerCase(Locale.forLanguageTag("tr"));
    }
}
