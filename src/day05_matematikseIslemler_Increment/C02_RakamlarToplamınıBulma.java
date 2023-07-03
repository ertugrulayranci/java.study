package day05_matematikseIslemler_Increment;

import java.util.Scanner;

public class C02_RakamlarToplamınıBulma {
    public static void main(String[] args) {

        // 3 basamaklı bir sayının rakamları toplamını yazdırın.
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen 3 basamaklı pozitif bir tamayı girin: ");
        int girilenSayi= scanner.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplamı = 0;

    //ilk sayi için birler basamağını bulalım.

        birlerBasamagi =girilenSayi %10;

        rakamlarToplamı= rakamlarToplamı +birlerBasamagi;

        //birler basamağındaki sayıdan artık kurtulalım

        girilenSayi = girilenSayi/10;

        // girilen sayıyı 2 basamaklı hale dönüştürdük

        birlerBasamagi =girilenSayi %10;

        rakamlarToplamı = rakamlarToplamı +birlerBasamagi;

        girilenSayi =girilenSayi/10;

        //sayı artık tek basamaklı

        birlerBasamagi =girilenSayi %10;

        rakamlarToplamı = rakamlarToplamı +birlerBasamagi;

        girilenSayi =girilenSayi/10;

        System.out.println("rakamlar toplamı:" +rakamlarToplamı);
    }
}
