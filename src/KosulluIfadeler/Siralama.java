import java.util.Scanner;

public class Siralama {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("1. sayıyı giriniz");
        int a = in.nextInt();

        System.out.println("2. sayıyı giriniz");
        int b = in.nextInt();

        System.out.println("3. sayıyı giriniz");
        int c = in.nextInt();

        if((a <b) && (a < c)) {
            if ((b < c)) {
                System.out.print("a < b < c");
            }
            else{
                System.out.print("a < c < b");
            }
        }else if((b < a) && (b < c)) {
            if ((a < c)) {
                System.out.print("b < a < c");
            }
            else {
                System.out.print("b < c < a");
            }
        }
        else{
            if ((a < b)) {
                System.out.print("c < a < b");
            }
            else {
                System.out.print("c < b < a");
            }
        }

    }
}
