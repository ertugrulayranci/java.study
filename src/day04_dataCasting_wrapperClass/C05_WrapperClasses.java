package day04_dataCasting_wrapperClass;

public class C05_WrapperClasses {
    public static void main(String[] args) {
        String str= "java candır";
         System.out.println(str.charAt(3));

         int sayi =20;

         int sayi2 =5;
         Integer sayi3 = sayi2;
         int sayi4 = sayi3;

        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Integer.MAX_VALUE); //2147483647

     //   short sayi5 = (Short)sayi3; wrapper class'lar arasında casting olmaz'

        //içinde sadece sayısal ifadeler bulunan bir string verildiğinde
        //matematiksel işlem yapmanız gerekirse
        //Integer.parseInt() ile int'e çevirebiliriz.
        String str1 ="22";
        String str2 ="33";

        // bu değerleri toplayıp yazdırın

        System.out.println(str1+str2);  //2233
        System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2));  //55

        char ch1 ='7';

        System.out.println(Character.isDigit(ch1)); //true
        System.out.println(Character.isLetter((ch1))); //false
        System.out.println(Character.isWhitespace(ch1)); //false

    }
}
