package KosulluIfadeler;

import java.util.Scanner;

public class KdvTutari {
   public static void main(String[] args){

        int bSayi,iSayi,select;
       Scanner in = new Scanner (System.in);

       System.out.print("Birinci sayıyı giriniz: ");
       bSayi = in.nextInt();
       System.out.print("İkinci sayıyı giriniz: ");
       iSayi = in.nextInt();

        System.out.println(" 1 Toplama\n 2 Çıkarma \n 3 Çarpma \n 4 Bölme");
        System.out.print("Yapmak istediğiniz işlemi giriniz: ");
        select = in.nextInt();

        switch (select){

            case 1 : System.out.print("Toplam: " + (bSayi + iSayi));
                break;
            case 2 : System.out.print("Çıkarma: " + (bSayi - iSayi));
                break;
            case 3 : System.out.print("Çarpma: " + (bSayi * iSayi));
                break;
            case 4 :
                switch (iSayi){
                    case 0 : System.out.print("Bir sayı 0'a bölünmez");
                    break;
                    default:System.out.print("Bölme: " + (bSayi / iSayi));
                    }
                    break;
            default: System.out.print("Yanlış değer girdiniz tekrar deneyiniz");
        }

    }
}
