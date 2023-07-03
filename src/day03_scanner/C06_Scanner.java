package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        //Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen çemberin yarıçağını giriniz");
        double yaricap =scanner.nextDouble();
        System.out.println("çemberin çevres:" + 2*3.14*yaricap);
        System.out.println("dairenin alanı:" + 3.14*yaricap*yaricap );
    }
}
