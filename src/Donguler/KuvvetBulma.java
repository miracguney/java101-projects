package Donguler;

import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Sayı giriniz");
        int sayi = in.nextInt();

        int i, j;

        for (i = 1, j = 1; i <= sayi && j <= sayi; i *= 4, j *= 5) {
            System.out.println(i + "\t" + j);
        }
}
}
