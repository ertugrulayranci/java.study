package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        //7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner =new Scanner(System.in);

        System.out.println("lütfen ilk sayıyı giriniz");
        int ilkSayi = scanner.nextInt();
        System.out.println("lütfen ikinci sayıyı giriniz");
        int ikinciSayi = scanner.nextInt();
       int temp = ilkSayi;
       ilkSayi = ikinciSayi;
       ikinciSayi = temp;
        System.out.println("ilk sayının yeni değeri:" + ilkSayi);
        System.out.println("ilk sayının yeni değeri:" + ikinciSayi);

    }
}
