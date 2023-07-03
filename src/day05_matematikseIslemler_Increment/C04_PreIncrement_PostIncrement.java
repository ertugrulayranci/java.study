package day05_matematikseIslemler_Increment;

public class C04_PreIncrement_PostIncrement {
    public static void main(String[] args) {
        //Java'da bir önceki class'da yaptığımız gibi artırma ve atama veya artırma ve yazdırma beraber olabilir.

        int a =20;

        int b = 10;

        System.out.println(b=2*a);
        System.out.println(a=b-5);

        a=10;

        //önce a'nın değerini b'ye atatın sonra a'yı artırın

        b=a++;
        System.out.println("a : " +a + " b: " +b );  //a : 11 b: 10

    a=10;

    //önce a'nın değerini artırın, sonra a'nın değerini b'ye atayın.

        b=++a;

        System.out.println("a : " +a + " b: " +b ); //a : 11 b: 11
/* bu kullanım sadece a++ a-- ++a --a için geçerli
* burada ++ veya --'yi önce mi yoksa sonra mı kullanacağımıza bizden istenen duruma göre karar veririrz.
* artırma önce ise ++a
* artırma sonra ise a++
*
* */

        a=20;

        System.out.println(a++);//20 önce yazdırma sonra artırma
        System.out.println(a);//21

        a=20;

        System.out.println(--a);//19 önce azaltma sonra yazdırma
        System.out.println(a);//19

    }
}
