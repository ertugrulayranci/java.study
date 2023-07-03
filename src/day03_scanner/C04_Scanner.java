package day03_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
    //    Isminiz : John
      //  Soyisminiz : Doe
        //Yasiniz : 44
   //     Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen isminizi yazınız");
        String girilenIsim =scanner.nextLine();

        System.out.println("lütfen soy ismini girin");
        String girilenSoyIsim = scanner.nextLine();

        System.out.println("lütfn yasınızı giriniz");
        int girilenYas = scanner.nextInt();

        System.out.println("isminiz:" + girilenIsim);
        System.out.println("soyisminiz:" +girilenSoyIsim);
        System.out.println("yasınız" + girilenYas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");

// stringin altına geçmesi için \n kullanırız.

    }
}
