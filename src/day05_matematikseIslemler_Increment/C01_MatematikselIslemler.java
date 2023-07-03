package day05_matematikseIslemler_Increment;

public class C01_MatematikselIslemler {
    public static void main(String[] args) {
        int a =27;
        int b =4;

        //tam sayıyı bölerseniz sonucu tamsayı
        System.out.println(a/b); // 27/4=6.75 ==>6

        double c =27;

        //eğer bölünen veya bölen double is sonucu double verir.

        System.out.println(c/b); //27/4=6.75

        System.out.println(2567 % 10); //On ile bölümünden kalan 7

        double sonuc3 = (double)a /b;

        System.out.println(sonuc3);
    }
}
