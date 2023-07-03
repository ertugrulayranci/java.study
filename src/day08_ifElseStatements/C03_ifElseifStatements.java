package day08_ifElseStatements;

import java.util.Scanner;

public class C03_ifElseifStatements {
    public static void main(String[] args) {
        //Ogrencinin notu 85 ve ustu ise AA,
        //(85 ve ustu degilse) 65 ve ustu ise BB,
        //(65 ve ustu de degilse) 50 ve ustu ise CC,
        //(geriye kalanlar) DD

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        int not = scanner.nextInt();

        if (not>=85) System.out.println("AA");
        else if (not>=65) System.out.println("BB");
        else if (not>=50) System.out.println("CC");
        else System.out.println("DD");
    }
}
