package day09_NestedifElseStatements_Ternary;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scanner =new Scanner(System.in);
        System.out.println("iki farklı tamsayı giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        System.out.println(sayi1<sayi2 ? sayi1 : sayi2);




    }
}
