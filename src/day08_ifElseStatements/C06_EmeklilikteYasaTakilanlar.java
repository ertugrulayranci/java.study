package day08_ifElseStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C06_EmeklilikteYasaTakilanlar {
    public static void main(String[] args) {
        //- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("cinsiyetiniz? E: Erkek, K:Kadın");
        char cinsiyet =scanner.next().toUpperCase().charAt(0);
        System.out.println("lütfen yasınızı giriniz");
        double yas = scanner.nextDouble();

        if(cinsiyet == 'E' && yas>=65){
            System.out.println("Erkek emekli olabilir");
        }
        else if(cinsiyet =='E' && yas<65){
            System.out.println("Erkek emekli olamaz," +(65-yas) +"yıl daha calısmalısnız");
        }
        else if (cinsiyet =='K' && yas>=60){
            System.out.println("Kadın emekli olabilir");
        } else if (cinsiyet =='K' && yas <60){
            System.out.println("Kadın emekli olamaz," +(60-yas) +"yıl daha calısmalısnız");
        }

    }
}
