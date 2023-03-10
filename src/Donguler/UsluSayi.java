package Donguler;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Üssü alınacak sayi");
        int n = in.nextInt();
        System.out.println("Üss olacak sayi");
        int k = in.nextInt();

        int i, toplam = 1;

        for (i = 1; i <= k; i++) {
            toplam *= n;
        }
        System.out.println(toplam);


    }
}
