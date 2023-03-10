package Donguler;

import java.util.Scanner;

public class DongulerleOrtalama {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Sayı giriniz");
        int sayi = in.nextInt();

        int sayac = 0, toplam = 0;

        for (int i = 0; i <= sayi; i++){
            if (i % 3 == 0 && i % 4 == 0 ){
                sayac++;
                toplam += i;
            }
        }
        System.out.println(toplam/sayac);
    }
}
