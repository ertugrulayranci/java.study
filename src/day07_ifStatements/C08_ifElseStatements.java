package day07_ifStatements;

import java.util.Scanner;

public class C08_ifElseStatements {
    public static void main(String[] args) {
        //kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın
        // üçgen eşkenar ise "eşkenar üçgen" yzdırın
        //değilse "eşkenar değil yazdırın

        Scanner scanner =new Scanner(System.in);
        System.out.println("üçgenin kenar uzunluklarını girin");
        double kenar1 =scanner.nextDouble();
        double kenar2 =scanner.nextDouble();
        double kenar3 =scanner.nextDouble();
        if(kenar1==kenar2&& kenar1==kenar3 &&kenar1>0){
            System.out.println("eşkenar üçgen");
        }else{
            System.out.println(("eşkenar üçgen değil"));
        }
    }
}
