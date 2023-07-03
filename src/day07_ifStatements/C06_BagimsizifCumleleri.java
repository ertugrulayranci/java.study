package day07_ifStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C06_BagimsizifCumleleri {
    public static void main(String[] args) {
        //Kullanıcıdan pozitif bir tam sayı iteyin
        // Sayı 3 veya 5 ile bolunuyorsa
        // güzel sayi yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir pozitif tamsayı giriniz");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi%3 ==0 || girilenSayi %5 == 0){
            System.out.println("güzel sayi");
        }
    }
}
