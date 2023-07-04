package day09_NestedifElseStatements_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {


        //kullanıcıdan bir tamsayı alın
        //sayının tek mi çift mi olduğunu yazdırın

        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int sayi =scanner.nextInt();

        if(sayi %2 == 0){
            System.out.println("çift sayı");
        }else{
            System.out.println("tek sayi");
        }
        System.out.println(sayi %2 == 0 ? "çift sayi" :"tek sayi");
    }
}
