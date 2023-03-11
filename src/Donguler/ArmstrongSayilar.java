package Donguler;

import java.util.Scanner;

public class ArmstrongSayilar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int sayi;
        int basSayi = 0;

        int basDegeri;
        int toplam = 0;
        int usAlma;

      do{


          System.out.print("Çıkmak için 0'a basabilirsiniz");
          System.out.println("Sayi giriniz : ");

          sayi = in.nextInt();
          int geciciSayi = sayi;

            while (0 != geciciSayi){
                geciciSayi /= 10;
                basSayi++;
            }

            geciciSayi = sayi;
            while (0 != geciciSayi){
                basDegeri = geciciSayi % 10;
                usAlma = 1;
                for(int i = 1; i <= basSayi; i++){
                    usAlma *= basDegeri;
                }
                toplam += usAlma;
                geciciSayi /= 10;
            }

            if(toplam == sayi){
                System.out.println(sayi + " Armstorng sayıdır");
            }else {
                System.out.println(sayi + " Armstorng değil");
            }
        } while (sayi != 0);


    }
}
