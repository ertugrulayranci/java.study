package day04_dataCasting_wrapperClass;

public class C03_CharDataCasting {
    public static void main(String[] args) {
      /*
      char data ozet bir data turudur.char data turundeki bir variable'i matematiksel işlemde kullanırsanız ascii tablosundaki değeri kullanırsınız.

      */

        char ch1 ='B';

        int sayi1 = ch1;

        System.out.println("ch1: "+ ch1);
        System.out.println("sayi1: " + sayi1);

        String str1 ="Java";
        String str2  ="";
        String str3 = "Candir";

        System.out.println(str1+str2+str3);

        char ch2 = 'a';
        char ch3 ='b';
        System.out.println((ch2+ch3));


        // verilen bir sayının ascii tablosundaki karsılığını yazıdırn

        int karakter = 50;

        char asciDegeri = (char)karakter;
        System.out.println("verilen sayının ascii tablosundaki karsılığı:" +asciDegeri);


    }
}
