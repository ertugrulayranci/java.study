package day10_SwitchCase_StringManipulations;

import java.util.Scanner;

public class C01_SwitchStatements {
    public static void main(String[] args) {
        //Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        //ve girilen harfin karsiligini yazdirin.
        //I : International
        // S : Software
        // T : Testing
        // Q : Qualifications
        // B: Board

        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen anlamını görmek istediğin harfi girin");
        char harf = scanner.next().toUpperCase().charAt(0);
        switch (harf){
            case 'I':
                System.out.println("Interntional");
                break;
            case 'S':
                System.out.println("Software");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            case 'Q':
                System.out.println("Qualifications");
                break;
            case 'B':
                System.out.println("Board");
                break;
            default:
                System.out.println("gecersiz harf");

        }

    }
}
