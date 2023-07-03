package day07_ifStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C07_ifElseStatements {
    public static void main(String[] args) {
        //kullanıcıdan notunu isteyin
        // 50 ve üzeri ise sıfınıf geçtin yazdırın
        // değilse sınıfta kaldın yazdırın

        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz");
        double not = scanner.nextDouble();
        if(not>=50){
            System.out.println("sınıfı geçtin");
        }else{
            System.out.println("malesef sınıfta kaldınız");
        }
    }
}
