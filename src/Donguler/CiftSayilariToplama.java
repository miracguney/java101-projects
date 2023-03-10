package Donguler;

import java.util.Scanner;

public class CiftSayilariToplama {
    public static void main(String[] args){


        Scanner in = new Scanner(System.in);

        int toplam = 0, sayi;

        do{
            System.out.println("Sayı giriniz");
            sayi = in.nextInt();
            if (sayi % 4 == 0){
                toplam += sayi;

            }


        }while(sayi % 2 == 0);
        System.out.println("Toplam: " + toplam);

    }
}
