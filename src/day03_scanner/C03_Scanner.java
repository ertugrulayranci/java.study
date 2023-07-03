package day03_scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan bir double,  bir de int ayı alıp bunların toplamını ve carpımını yazdırın.

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen bir double sayı giriniz");
        double girilenDouble =scanner.nextDouble();
        System.out.println("lutfen bir tamsayı girin");
        int girilenInt =scanner.nextInt();
        System.out.println("iki sayınının toplamı:" + (girilenInt +girilenDouble));
        System.out.println("iki sayının çarpımı:" +girilenInt*girilenDouble);
    }
}
