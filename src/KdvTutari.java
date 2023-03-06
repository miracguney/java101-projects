import java.util.Scanner;

public class KdvTutari {
   public static void main(String[] args){

        double tutar, kdvOranı = 0, kdvTutar, kdvliTutar;
        System.out.print("Tutarı giriniz: ");
        Scanner in = new Scanner (System.in);
         tutar = in.nextDouble();



        if(tutar > 0 && tutar <1000){
            kdvOranı = 0.18;
        }else if(tutar >= 1000){
            kdvOranı = 0.08;
        }

        kdvTutar = tutar * kdvOranı;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV oranı: " + kdvOranı);
        System.out.println("KDV tutarı: " + kdvTutar);
        System.out.println("KDV'li tutar: " + kdvliTutar);

    }
}
