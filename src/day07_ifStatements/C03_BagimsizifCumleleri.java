package day07_ifStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_BagimsizifCumleleri {
    public static void main(String[] args) {
        //soru 1- kullanıcıdan bir pozitif sayı isteyin.
        // sayi 5' tam bolunuyor ise sayi "Sayi 5'in tam katı" yazdırın"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayı girin");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi %5 == 0) System.out.println("Sayi 5'in tam katı");

    }
}
