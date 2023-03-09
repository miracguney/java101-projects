package KosulluIfadeler;

import java.util.Scanner;


public class AlanHesaplama {
    public static void main(String[] args){

        int bKenar, iKenar, uKenar, cevre, u;
        double alan;

        Scanner in = new Scanner (System.in);

        System.out.print("Lütfen birinci kenarı giriniz: ");
        bKenar = in.nextInt();
        System.out.print("Lütfen ikinci kenarı giriniz: ");
        iKenar = in.nextInt();
        System.out.print("Lütfen üçüncü kenarı giriniz: ");
        uKenar = in.nextInt();

        cevre = (bKenar + iKenar + uKenar);
        u = (bKenar + iKenar + uKenar) / 2;

        alan = Math.sqrt((u * (u - bKenar) * (u - iKenar) * (u - uKenar)));


        System.out.println("Üçgenin Alanı: " + alan);
        System.out.println("Üçgenin çevresi: " + cevre);


    }
}
