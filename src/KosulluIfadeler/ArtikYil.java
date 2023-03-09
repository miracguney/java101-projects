import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        int yil = in.nextInt();

        int artikYil = yil % 4;
        int artikYilDeğil = yil % 400;

        if(artikYil == 0 || artikYilDeğil == 0){
            System.out.println(yil +" Bir artık yıldır");
        }else {
            System.out.println(yil + " Bir artık yıl değildir");
        }
        }
    }
