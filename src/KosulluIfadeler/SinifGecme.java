import java.util.Scanner;

public class SinifGecme {




    public static void main(String[] args){

    Scanner in = new Scanner(System.in);

        int ekliDers = 0;
        int toplamNot = 0;

        System.out.println("Belirtilen Derslerin notlarını giriniz");

        System.out.print("Matematik: ");
    int mat = in.nextInt();
        if(( 0<= mat) && (mat<= 100)){
            ekliDers += 1;
            toplamNot += mat;
        }

        System.out.print("Fizik: ");
    int fizik = in.nextInt();
        if(( 0<= fizik) && (fizik<= 100)){
            ekliDers += 1;
            toplamNot += fizik;
        }

        System.out.print("Kimya: ");
    int kimya = in.nextInt();
        if(( 0<= kimya) && (kimya<= 100)){
            ekliDers += 1;
            toplamNot += kimya;
        }

        System.out.print("Türkçe: ");
    int turkce = in.nextInt();
        if(( 0<= turkce) && (turkce<= 100)){
            ekliDers += 1;
            toplamNot += turkce;
        }

        System.out.print("Tarih: ");
    int tarih = in.nextInt();
        if(( 0<= tarih) && (tarih<= 100)){
            ekliDers += 1;
            toplamNot += tarih;
        }

        System.out.print("Müzik: ");
    int muzik = in.nextInt();
        if(( 0<= muzik) && (muzik<= 100)){
            ekliDers += 1;
            toplamNot += muzik;
        }




    double sonuc = toplamNot/ ekliDers;

    if(sonuc <= 55){
        System.out.println("Kaldınız");
    }else {
        System.out.println("Geçtiniz");
    }

    System.out.println("Ortalama " + sonuc);


}

}
