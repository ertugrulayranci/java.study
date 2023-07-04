package day09_NestedifElseStatements_Ternary;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {
       // Kullanicidan bir sayi alin ve mutlak degerini yazdirin
        Scanner scanner =new Scanner(System.in);
        System.out.println("bir sayi girin");
        double sayi = scanner.nextDouble();
        System.out.println(sayi<0 ? sayi*(-1) : sayi);

    }
}
