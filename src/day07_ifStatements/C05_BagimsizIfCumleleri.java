package day07_ifStatements;

import javax.xml.transform.SourceLocator;
import java.sql.SQLOutput;
import java.util.Scanner;

public class C05_BagimsizIfCumleleri {
    public static void main(String[] args) {
        //Kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın,
        //üçgen eşkenar ise "eşkenar üçgen yazın"

        //not: Javada 3lü karşılaştırma yoktur.
        Scanner scanner = new Scanner(System.in);
        System.out.println(("üçgenin kenar uzunluklarını giriniz"));
        double kenar1 =scanner.nextDouble();
        double kenar2 =scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if( kenar1 == kenar2 && kenar1 ==kenar3 &&kenar1>0){
            System.out.println("eşkenar üçgendir");
        }





    }
}
