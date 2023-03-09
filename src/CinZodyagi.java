import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Girini : ");
        int dY = in.nextInt();


        int burc = dY % 12;

        switch (burc){
            case 0: Burc("Maymun"); break;
            case 1: Burc("Horoz"); break;
            case 2: Burc("Köpek"); break;
            case 3: Burc("Domuz"); break;
            case 4: Burc("Fare"); break;
            case 5: Burc("Öküz"); break;
            case 6: Burc("Kaplan"); break;
            case 7: Burc("Tavşan"); break;
            case 8: Burc("Ejderha"); break;
            case 9: Burc("Yılan"); break;
            case 10: Burc("At"); break;
            case 11: Burc("Koyun"); break;
            default:break;
        }
    }

    public static void Burc(String burc){
        System.out.print("Çin Zodyağı Burcunuz :" + burc);
    }
}
