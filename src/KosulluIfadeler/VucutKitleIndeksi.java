package KosulluIfadeler;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args){

        double boy, kilo, vki;

        Scanner in = new Scanner (System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = in.nextInt();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = in.nextDouble();

        vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz :" + vki);


    }
}
