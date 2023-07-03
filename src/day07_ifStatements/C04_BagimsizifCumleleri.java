package day07_ifStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C04_BagimsizifCumleleri {
    public static void main(String[] args) {
        // Kullanıcıdan bir tamsayı isteyin.
        //sayi 3 ile bolunuyorsa "uc ile bolunebilir"
        //sayi 5 ile bolunuyorsa "5 ile bolunebilen sayı"

    Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir tam sayı girin");
        int girilenSayi = scanner.nextInt();
                if(girilenSayi %3 == 0){
                    System.out.println("üç ile bolunebilen sayı");
                }
                if(girilenSayi %5 ==0){
                    System.out.println("5 ile bolunebilen sayı");
                }



    }
}
