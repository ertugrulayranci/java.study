package day03_scanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        //Kullanıcıdan tam sayı alıp karesini bulma
        //scanner ile bilgiyi 3 adımda alırız
        //1- scannner objesi oluşturma

        Scanner scanner = new Scanner(System.in);

        //2-kullanıcıdan ne istediğiniz söyleyin

        System.out.println("tam sayı girin");

        // 3- istediğiniz datanın türüne uygun variable oluşturun

        int girilenSayi = scanner.nextInt();

        //kullanıcının girdiği sayı kod ortamına kaydoldu.

        System.out.println("girilen sayının karesi:" + girilenSayi*girilenSayi);

    }
}
