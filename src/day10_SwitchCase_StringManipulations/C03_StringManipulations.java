package day10_SwitchCase_StringManipulations;

public class C03_StringManipulations {
    public static void main(String[] args) {

       //eğer yapıan işlem sonucundaki işlemin kalıcı olmasını isterseniz atama yapmalıyız.

        String str = "Java candir";

        //str'in ilk harfini yazdırın

        System.out.println(str.charAt(0)); //J

        //str'i tüm harfleri büyük olacak şekilde yazdırın
        System.out.println(str.toUpperCase());

        //str'i tamamen küçük harflerden oluşan bir metne çevir.

        str = str.toLowerCase();
        System.out.println(str);
    }
}
