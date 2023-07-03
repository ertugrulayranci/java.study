package day09_NestedifElseStatements_Ternary;

import java.util.Scanner;

public class C02_Indirimhesaplama {
    public static void main(String[] args) {
        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scanner =new Scanner(System.in);
        System.out.println("ürün adedini giriniz");
        int urunsayisi =scanner.nextInt();
        System.out.println("liste fiyatını girin");
        double listeFiyatı =scanner.nextDouble();
        System.out.println("müsteri kartiniz var mi? \n E:Evet , H:Hayır");
        char kartVarmi =scanner.next().toUpperCase().charAt(0);

        //ana degisken kart varmi sorusu olsun?

        if (kartVarmi == 'E'){

            // Musteri karti varsa 10 urunden fazla alirsa %20,yoksa %15 indirim yapin,
            if(urunsayisi>10){
                System.out.println("Yüzde 20 indirimli toplam fiyat: " + urunsayisi*listeFiyatı*0.8);
            }else{
                System.out.println("Yüzde 15 indirimli toplam fiyat: " + urunsayisi*listeFiyatı*0.85);
            }

        }else if (kartVarmi=='H'){
            if(urunsayisi>10){
                System.out.println("Yüzde 15 indirimli toplam fiyat: " + urunsayisi*listeFiyatı*0.85);
            }else{
                System.out.println("Yüzde 10 indirimli toplam fiyat: " + urunsayisi*listeFiyatı*0.9);
            }

        }else {
            //hatalı kart bilgisi
            System.out.println("kart bilgisi hatalı");
        }
    }
}
