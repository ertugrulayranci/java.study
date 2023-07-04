package day09_NestedifElseStatements_Ternary;

public class C04_Ternary {
    public static void main(String[] args) {
        int input =20;
       // input %3 ==0 ? "3ebolunur":"3ebolunmez";
        //ternary bize burada string donduruyor, ya direk yazdırın veya string variable'a atayn
       System.out.println( input %3 ==0 ? "3ebolunur":"3ebolunmez");
       String sonuc =input %3 ==0 ? "3ebolunur":"3ebolunmez";
        System.out.println(sonuc);
    }
}
