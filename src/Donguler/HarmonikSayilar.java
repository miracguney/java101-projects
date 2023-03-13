package Donguler;

import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {
        int n;
        double toplam = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen n sayısını giriniz: ");
        n = input.nextInt();

        for (double i = 1; i <= n; i++) {
            toplam += 1 / i;
        }

        System.out.println("Sonuç: " + toplam);
    }
}
