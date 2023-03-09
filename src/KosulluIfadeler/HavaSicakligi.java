import java.util.Scanner;

public class HavaSicakligi {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz");
        int sicaklik = in.nextInt();


        if(sicaklik < 5){
            System.out.print("Kayak yapabilirsiniz");
        } else if((sicaklik >= 5) && (sicaklik <= 15)){

            System.out.println("Sinemaya Gidebilirsiniz");

            if(sicaklik >= 10){
                System.out.print("Pikniğe Gidebilirsiniz");
                }
        } else{
            System.out.print("Yüzmeye Gidebilirsiniz");
        }


    }
}
