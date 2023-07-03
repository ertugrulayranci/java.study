package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan bir diktörtgenin iki kenar uzunlugu alıp alanını yazdırın
        Scanner scnanner = new Scanner(System.in);

        System.out.println("lütfen diktörtgenin iki kenarını giriniz");

        double kenar1 = scnanner.nextDouble();
        double kenar2 = scnanner.nextDouble();

        System.out.println("diktörtgenin alanı:" + kenar2*kenar1);
    }
}
