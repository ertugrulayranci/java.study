package day08_ifElseStatements;

import java.util.Scanner;

public class C07_NestedifElseStatements {
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

        if(cinsiyet == 'E'){
            if (yas<0 || yas>100){
                System.out.println("gecersiz yas girdiniz");
            } else if (yas>=65){
                System.out.println("erkek emekli olabilir");
            }
            else{
                System.out.println("Emekli olmanıza " +(65-yas) + " yıl daha kaldı");
            }
        }else if (cinsiyet =='K'){
            if (yas<0 || yas>100){
                System.out.println("gecersiz yas");
            }
            else if (yas>60){
                System.out.println("kadın emekli olabilir");
            }
            else{
                System.out.println("Emekli olmanıza " +(60-yas) + " yıl daha kaldı");
            }
        }
        else {
            System.out.println("cinsiyet hatalı girildi");
        }
    }
}
