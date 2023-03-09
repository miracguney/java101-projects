import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Doğduğunuz ayı giriniz");
        int ay = in.nextInt();

        System.out.println("Doğduğunuz günü giriniz");
        int gun = in.nextInt();

        String burc = "";
        boolean isError = false;

        if(ay == 1) {
            Burclar(gun,burc,isError,28,21,"Oğlak","Kova");
        } else if(ay == 2) {
            Burclar(gun,burc,isError,28,19,"Kova","Balık");
        } else if(ay == 3) {
           Burclar(gun,burc,isError,30,20,"Balık","Koç");
        } else if(ay == 4) {
            Burclar(gun,burc,isError,30,20,"Koç","Boğa");
        } else if(ay == 5) {
            Burclar(gun,burc,isError,30,20,"Boğa","İkizler");
        } else if(ay == 6) {
            Burclar(gun,burc,isError,30,20,"İkizler","Yengeç");
        } else if(ay == 7) {
            Burclar(gun,burc,isError,30,20,"Yengeç","Aslan");
        } else if(ay == 8) {
            Burclar(gun,burc,isError,30,20,"Aslan","Başak");
        } else if(ay == 9) {
            Burclar(gun,burc,isError,30,20,"Başak","Terazi");
        } else if(ay == 10) {
            Burclar(gun,burc,isError,30,20,"Terazi","Akrep");
        } else if(ay == 11) {
            Burclar(gun,burc,isError,30,20,"Akrep","Yay");
        } else if(ay == 12) {
            Burclar(gun,burc,isError,30,20,"Yay","Oğlak");
        }

    }

    public static void Burclar(int gun, String burc, boolean isError, int aySonu, int burcLimiti, String burcBir, String burcIki){
        if (gun >= 1 && gun <= aySonu) {
            if (gun <= burcLimiti) {
                burc = burcBir;
            } else {
                burc = burcIki;
                }
            } else {
            isError = true;
            }

        if(isError){
            System.out.println("Yanlış bir tercih yaptınız tekrar deneyiniz");
        }else {
            System.out.println("Burcunuz "+ burc);
        }
    }
}
