package day09_NestedifElseStatements_Ternary;

import java.util.Scanner;

public class C01_EmemklilikIkinciCozum {
    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cinsiyetiniz? E: Erkek, K: Kadın");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");
        double yas = scanner.nextDouble();

        if (yas < 10 || yas > 80) {
            System.out.println("Geçersiz yaş");
        } else if (yas < 60) {
            // Kimse emekli olamaz
            if (cinsiyet == 'K') {
                System.out.println("Kadın emekli olabilmesi için " + (60 - yas) + " yıl daha çalışmalı");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emekli olabilmesi için " + (65 - yas) + " yıl daha çalışmalı");
            } else {
                System.out.println("Geçersiz cinsiyet");
            }
        } else if (yas < 65) {
            // Sadece kadınlar emekli olabilir
            if (cinsiyet == 'K') {
                System.out.println("Kadın emekli olabilir");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emekli olabilmesi için " + (65 - yas) + " yıl daha çalışmalı");
            } else {
                System.out.println("Geçersiz cinsiyet");
            }
        } else { // Herkes emekli
            if (cinsiyet == 'K' || cinsiyet == 'E') {
                System.out.println("Emeklisiniz");
            } else {
                System.out.println("Geçersiz cinsiyet");
            }
        }
    }
}