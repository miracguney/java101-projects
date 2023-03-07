import java.util.Scanner;

public class ManavKasaProgrami {
        public static void main(String[] args){

            double Armut =2.14, Elma = 3.67, Domates = 1.11, Muz = 0.95, Patlıcan = 5.00;
            double armut, elma, domates, muz, patlıcan;
            double  a, e, d, m, p, total;

            Scanner in = new Scanner (System.in);

            System.out.println(
                    "------Fiyat Listesi-------\n" +
                    " Armut : 2,14 TL\n" +
                    "Elma : 3,67 TL\n" +
                    "Domates : 1,11 TL\n" +
                    "Muz: 0,95 TL\n" +
                    "Patlıcan : 5,00 TL" );

            soru("Armut");
            armut = in.nextInt();
            soru("Elma");
            elma = in.nextInt();
            soru("Domates");
            domates = in.nextInt();
            soru("Muz");
            muz = in.nextInt();
            soru("Patlıcan");
            patlıcan = in.nextInt();



            a = armut * Armut;
            e = elma * Elma;
            d = domates * Domates;
            m = muz * Muz;
            p = patlıcan * Patlıcan;

            total = a + e + d + m + p;
            System.out.println("Toplam Tutar : " + total);



        }
        static void soru(String ad){
            System.out.print(ad + "Kaç Kilo ? : ");

        }
}

