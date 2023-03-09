package Donguler;

import java.util.Scanner;

public class CiftiBulma {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Doğduğunuz ayı giriniz");
        int sayi = in.nextInt();

        int i = 0;
        while (i <= sayi){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }

    }
}
