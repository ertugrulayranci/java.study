package day07_ifStatements;

public class C01_BagimsizIfCumleleri {
    public static void main(String[] args) {
        int a = 20;
        int b =30;
        if(a>0){
            System.out.println("a sayisi pozitiftir");
        }
        if(a+b>100){
            System.out.println("sayiların toplamı 100'den buyuktur");
        }
        if(b%3 ==0){
            System.out.println("b 3 ile tam bölünür");
        }
        if (b < 100) {

            System.out.println("b 100'den küçüktür");
        }
    }
}
