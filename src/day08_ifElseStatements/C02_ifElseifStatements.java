package day08_ifElseStatements;

import java.util.Scanner;

public class C02_ifElseifStatements {
    public static void main(String[] args) {
        //kullanıcıdan bir tam sayı isteyin
        //sayı 3'e bolunuyorsa sayı 3'un katı
        // sayı 5'in bolunuyorsa  sayı 5'in katı
        // sayı 3'e ve 5'e bolunurse sayı super sayı
        //sayı 3'e ve 5'e bolunmezse yaramaz sayı

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        int girilenSayi = scanner.nextInt();
        if (girilenSayi %3 ==0 && girilenSayi %5 == 0)System.out.println("güzel sayi");
        else if(girilenSayi %3==0) System.out.println("3'e bolunur");
        else if (girilenSayi %5 == 0) System.out.println("5'e bolunur");
        else  System.out.println("yaramaz sayi");
    }
}
