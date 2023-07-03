package day05_matematikseIslemler_Increment;

public class C03_Increment_Decrement {
    public static void main(String[] args) {
        int sayi= 10;

        // sayi variable'nin değerini 2 katının 5 fazlasını yapın

        sayi=2*sayi+5;

        System.out.println(sayi);

        //2. yöntem

        sayi = 10;
        sayi*=2;
        sayi+=5;
        System.out.println(sayi);

        sayi=10;
        sayi*=3;
        sayi-=3;
        sayi/=3;
        System.out.println(sayi);

        int a = 10;
        //a'nın değerini yeni oluşturduğumuz b'ye atayıp, sonra a'nın değerini bir artırın
        //a ve b'yi yazdırın

        int b=a;
        a++;

        System.out.println("a : " +a + " b: " +b );

        a=10;
        //a'nın değerini 1 artırın. a'nın değerini b'ye atatyın

        a++;

        b=a;

        System.out.println("a : " +a + " b: " +b );


    }
}
