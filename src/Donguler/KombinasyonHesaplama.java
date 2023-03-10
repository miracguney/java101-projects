package Donguler;

import java.util.Scanner;

public class KombinasyonHesaplama {

 public static void main(String[] args){

     Scanner in = new Scanner(System.in);

     int n, r;

     System.out.println("N Değerini Giriniz");
     n = in.nextInt();

     System.out.println("R Değerini Giriniz");
     r = in.nextInt();

  double sonuc = FacN(n) / (FacR(r) * FacT(n,r));

     System.out.println(sonuc);

 }
 public static int FacN(int n){
     int toplam = 1;

     for (int i = 1; i <= n; i++) {
         toplam *= i;
     }
     return toplam;
    }

    public static int FacR(int r) {

        int toplam = 1;

        for (int i = 1; i <= r; i++) {
            toplam *= i;
        }
        return toplam;
    }

    public static int FacT(int n,int r) {

        int k = (n - r);
        int toplam = 1;

        for (int i = 1; i <= k; i++) {
            toplam *= i;
        }
        return toplam;
    }

}