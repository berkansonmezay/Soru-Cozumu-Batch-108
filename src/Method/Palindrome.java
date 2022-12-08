package Method;

import java.io.FilterOutputStream;

public class Palindrome {

    public static void main(String[] args) {
        // Verilen bir String'in palindrome olup olmadigini yazdirin
        // Palindrome : duz okunusu ile tersten okunusu birbirine ayni olan

        String str= "1234321";

        String tersStr=TerseCevirme.tersecevir(str);


        if (str.equals(tersStr)) {
            System.out.println("verilen string palindrome");
        }else {
            System.out.println("verilen string palindrome değil");
        }


    }
}
