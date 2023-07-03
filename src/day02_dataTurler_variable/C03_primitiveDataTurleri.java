package day02_dataTurler_variable;

public class C03_primitiveDataTurleri {
    public static void main(String[] args) {
        //1-boolean:mantıksal değerler olan true ve false kabul eder.
        boolean bl1 =true;
        boolean bl2 = false;
        //char '' içinde yazılır ve sadece 1  karakter kabul eder.
        char ch1 = 'a';
        char ch2 = '2';
        char ch3 = '/';
        //tam sayı kabul eden variable turler
       // 3-byte 4-short 5-int 6-long

        //turkiyedeki sehir nufus
        //data turu aynı olan variable'ların değerleri ne olursa olsun hafızadaki kapladıkları alan aynı.

        int nufus = 834250;
        int nufusBilecik= 30000;

        //bir şehirdeki noter sayısı
        short noterSayisiIstanbu= 456;

            float fl1 =20f;
        float fl2 =6f;
        float fl3=fl1/fl2;
        System.out.println(fl3);

        double db1 =20;
    double db2 =6;
            double db3= db1/db2;
        System.out.println(db3);

        //double bolme işlemlerinde  0,0000000001 gibi bir hata yapabilir.

String str ="hello";
        System.out.println(str);

        //verilen 2 sayıyı çarp sonucu yazdır

        int sayi1 =10;
        int sayi2=20;
        System.out.println("verilen 2 sayının çarpımı:" + sayi1*sayi2);
    }
}
