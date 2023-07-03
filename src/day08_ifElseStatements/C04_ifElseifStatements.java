package day08_ifElseStatements;

import java.util.Scanner;

public class C04_ifElseifStatements {
    public static void main(String[] args) {
        //kullanıcıdan bir tam sayı isteyin
        //sayı 3'e bolunuyorsa sayı 3'un katı
        // sayı 5'in bolunuyorsa  sayı 5'in katı
        // sayı 3'e ve 5'e bolunurse sayı super sayı

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        int girilenSayi = scanner.nextInt();
        if(girilenSayi %3==0 && girilenSayi %5==0) System.out.println("güzel sayi");
        else if (girilenSayi %3 ==0) System.out.println("3'ün katı");
        else if (girilenSayi %5==0) System.out.println("5'in katı");

    }
}
