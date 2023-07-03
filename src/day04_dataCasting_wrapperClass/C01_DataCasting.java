package day04_dataCasting_wrapperClass;

public class C01_DataCasting {
    public static void main(String[] args) {

        /*char,boolean ve String'i diğer data türlerine cast edemeyiz.
        -Sayısal data içeren primitive data türlerini birbirine cast edebiliriz.
        1- daha kucuk data türündeki değeri daha geniş data türündeki variable'a atarsak Java auto widening yapar.
        2- daha geniş kapsamlı data türündeki değeri  daha dar kapsamlı variable!a atama yaparsak
        Java bunu otomatik olarak yapmaz.
        Değerin önüne parantez acıp parantez içine cast etmek  istediğin data türünü yazabilirsin.

        */

        String str ="Java Candir";
       // int sayi1 = str;
       // char chr1 =str;
       // boolean bl1 = str;

        String s1 = str;

        // boolean bl2 =10;
        // boolean bl2 ="s";

        int sayi2= 'k';
        double dbl1 = sayi2;

        int sayi3 = 10;
        double dbl2 = 4.5;
        short sh1 =3;
        byte by1 =7;

        sayi3= (int)dbl2;
        sayi3 = sh1;
        sayi3= by1;
        dbl2 = sayi3;
        dbl2 =sh1;
        dbl2 =by1;

        by1 = (byte) dbl2;
        by1 =(byte) sh1;
        by1 = (byte) sayi3;

        sh1 = (short)dbl2;
        sh1 =(short)sayi3;

        sh1= by1;
    }
}
