package KosulluIfadeler;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        double yasIndirimi = 0, gdIndirim = 0, normalTutar = 0, indirimliTutar = 0, toplamT = 0;

        System.out.println("Mesafeyi km türünden giriniz :");
        int mesafe = in.nextInt();

        System.out.println("Yaşınızı giriniz :");
        int yas = in.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        int yolculukTipi = in.nextInt();

         normalTutar = mesafe * 0.10;

        if(mesafe>0 && yas>0){
            if(yas < 12) {
                yasIndirimi = normalTutar * 0.50;
                indirimliTutar = normalTutar - yasIndirimi;
            } else if( (12 <= yas) &&  (24 >= yas)) {
                yasIndirimi = normalTutar * 0.10;
                indirimliTutar = normalTutar - yasIndirimi;
            } else if(65 < yas) {
                yasIndirimi = normalTutar * 0.30;
                indirimliTutar = normalTutar - yasIndirimi;
            }if(yolculukTipi >0 && yolculukTipi<3){
                if(yolculukTipi == 2){
                    gdIndirim = indirimliTutar * 0.2;
                    toplamT = (indirimliTutar - gdIndirim)*2;
                    System.out.println("Toplam tutar: " + toplamT);
                }else {
                    System.out.println("Toplam tutar: " + normalTutar);
                }
            }else {
                System.out.println("1 veya 2 tuşlanmalıdır");
            }
        }else {
            System.out.println("Geçersiz bir değer girdiniz");
        }
    }


}
