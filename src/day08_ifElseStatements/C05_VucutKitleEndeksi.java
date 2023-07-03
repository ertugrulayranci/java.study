package day08_ifElseStatements;

import java.util.Scanner;

public class C05_VucutKitleEndeksi {
    public static void main(String[] args) {

       // Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayın
        // (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez
        //25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.//

        Scanner scanner = new Scanner(System.in);
        System.out.println("kilonuzu kg olrak giriniz");
        double kilo = scanner.nextDouble();

        System.out.println("boyunuzu cm olarak giriniz");
        double boy = scanner.nextDouble();

        double  vucutkitle=kilo*10000/(boy*boy);

        if(vucutkitle>=30){
            System.out.println("obez");
        }
        else if (vucutkitle>=25){
            System.out.println("kilolu");
        }
        else if (vucutkitle>=20){
            System.out.println("normal");
    }else{System.out.println("zaf");
        }}}