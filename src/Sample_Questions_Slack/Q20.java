package Sample_Questions_Slack;

import java.util.Scanner;

public class Q20 {
    /*
    Soru 20-)
        Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır. Daha sonra ismin aynı karakterlere
        sahip olup olmadığını kontrol edin.
        Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ; aynı karakterlere sahip degilse
        "String benzersiz karakterlere sahip"
        yazdırın. İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.

                Örnek:
                giriş: ama
		        çıkış: Dizede yinelenen karakterler var

                İpucu: İf Else ve Char kullanarak çözebiliriz.

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Üc harfli bir isim giriniz: ");
        String isim = scan.nextLine();

        if (isim.length()>3){
            System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
        }  else{
            if (isim.charAt(0)==isim.charAt(1) || isim.charAt(0)==isim.charAt(2) || isim.charAt(1)==isim.charAt(2)) {
                System.out.println("Dizede yinelenen karakterler var");
            }else {
                System.out.println("String benzersiz karakterlere sahip");
            }
        }

    }

}
