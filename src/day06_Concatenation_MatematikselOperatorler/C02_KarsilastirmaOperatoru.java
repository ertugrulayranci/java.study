package day06_Concatenation_MatematikselOperatorler;

public class C02_KarsilastirmaOperatoru {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;

        //Java'da = işareti karşılaştırma değil , atama işaretidir.(assignment)


        //Java'da eşitliği kontrol etmek istersek  == kullanırız.

        System.out.println(b==2*a); //20 ==20 ==>true
        //karşılaştırma operatorunde 2 tarafta da işlem olur.
        System.out.println(3*b>5*a); //60>50 ==>true

        System.out.println(b>=b-a); //20>=10 true

        }
}
