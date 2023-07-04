package day09_NestedifElseStatements_Ternary;

import java.util.Scanner;

public class C08_SwitchStatements {
    public static void main(String[] args) {
        //kullanıcıdan ay numarasını alıp ayın ismini yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("yazdırmak istediğiniz ay kaçıncı aysa onu yazın");
        int ayNo=scanner.nextInt();

        if (ayNo == 1) System.out.println("ocak");
        else if (ayNo ==2) System.out.println("şubat");
        else if (ayNo ==3) System.out.println("mart");
        else if (ayNo ==4) System.out.println("nisan");
        else if (ayNo ==5) System.out.println("mayıs");
        else if (ayNo ==6) System.out.println("haziran");
        else if (ayNo ==7) System.out.println("temmuz");
        else if (ayNo ==8) System.out.println("ağustos");
        else if (ayNo ==9) System.out.println("eykül");
        else if (ayNo ==10) System.out.println("ekim");
        else if (ayNo ==11) System.out.println("kasım");
        else if (ayNo ==12) System.out.println("aralık");
        else System.out.println("ay no gecersiz");

        System.out.println("-------------------------");

    switch (ayNo){
        case 1:
            System.out.println("ocak");
            break;
        case 2:
            System.out.println("şubat");
            break;
        case 3:
            System.out.println("mart");
            break;
        case 4:
            System.out.println("nisan");
            break;
        case 5:
            System.out.println("mayıs");
            break;
        case 6:
            System.out.println("haziran");
            break;
        case 7:
            System.out.println("temmuz");
            break;
        case 8:
            System.out.println("ağustos");
            break;
        case 9:
            System.out.println("eylül");
            break;
        case 10:
            System.out.println("ekim");
            break;
        case 11:
            System.out.println("kasım");
            break;
        case 12:
            System.out.println("aralık");
            break;
        default:
            System.out.println("ay no geçersiz");

    }
}}
