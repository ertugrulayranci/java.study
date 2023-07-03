package day07_ifStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C09_ifElseStatements {
    public static void main(String[] args) {
        //kullanıcıdan bir karakter isteyin
        //girilen karakterin büyük harf olup olmadığını yazdırın

        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char girilenKarakter =scanner.next().charAt(0);
        //kelimenin ilk karakterini alır.
        if(girilenKarakter >= 'A' && girilenKarakter<='Z'){
            System.out.println("girilen karakter büyük harf");
        }
        else{
            System.out.println("girilen karakter büyük harf değil");
        }
    }
}
