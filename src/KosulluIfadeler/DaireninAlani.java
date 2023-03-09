import java.util.Scanner;

public class DaireninAlani {
    public static void main(String[] args){

        int r, a;
        double alan, π = 3.14;

        Scanner in = new Scanner (System.in);

        System.out.print("Yarıçapı giriniz: ");
        r = in.nextInt();
        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        a = in.nextInt();


        alan = (π * (r * r) * a) / 360;
        System.out.println("Üçgenin Alanı: " + alan);



    }
}