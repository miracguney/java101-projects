import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Belirtilen Derslerin notlarını giriniz");

        System.out.print("Matematik: ");
        int mat = in.nextInt();

        System.out.print("Fizik: ");
        int fizik = in.nextInt();

        System.out.print("Kimya: ");
        int kimya = in.nextInt();

        System.out.print("Türkçe: ");
        int turkce = in.nextInt();

        System.out.print("Tarih: ");
        int tarih = in.nextInt();

        System.out.print("Müzik: ");
        int muzik = in.nextInt();

        double sonuc = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println(sonuc);

        boolean gecti = sonuc >= 60;

        String gectiMi = gecti ? "Sınıfı Gecti" : "Sınıfta kaldı";
        System.out.println(gectiMi);

    }
}
