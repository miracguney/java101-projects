import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args){

        String kullaniciAdi,sifre,tekrarDeneme,yeniSifre,enyeniSifre;
        Scanner in = new Scanner (System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciAdi = in.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        sifre = in.nextLine();


        if((kullaniciAdi.equals("p")) && (sifre.equals("a"))){
            System.out.println("Giriş Başarılı");
        }else{
            System.out.println("Giriş Başarısız Şifreyi sıfırlamak istermisiniz (evet,hayır)");
            tekrarDeneme = in.nextLine();
            if (tekrarDeneme.equals("evet")){
                System.out.println("Lütfen yeni şifrenizi giriniz ");
                yeniSifre = in.nextLine();
                if (yeniSifre.equals(sifre)){
                    System.out.println("Şifreniz eski şifrenizle aynı lütfen başka şifre deneyiniz");
                    enyeniSifre = in.nextLine();
                    if (enyeniSifre.equals(sifre)){
                        System.out.println("Şifreniz eski şifrenizle aynı lütfen başka şifre deneyiniz");
                    }else {
                        System.out.println("Şifre oluşturuldu");
                    }
                }else {
                    System.out.println("Şifre oluşturuldu");
                }
            }else if(tekrarDeneme.equals("hayır")){
                System.out.println("umarız hatırlarsınz");
            }
        }
    }
}
