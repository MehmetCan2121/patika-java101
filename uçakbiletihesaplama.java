import java.util.Scanner;

public class uçakbiletihesaplama {
    public static void main(String[] args) {
        int km, yasi, yltipi;
        double ücret;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mesafeyi Kilometre Cinsinden giriniz:");
        km = sc.nextInt();
        System.out.println("Yaşını giriniz:");
        yasi = sc.nextInt();
        System.out.println("Yolculuk tipini giriniz(1=>Tek 2=>Gidiş Dönüş):");
        yltipi = sc.nextInt();
        ücret = km * 0.10;
        if (km < 0 || yasi < 0 || (yltipi != 1 && yltipi != 2)) {
            System.out.println("Hatalı Giriş");
        } else if (yasi < 12) {

            ücret = (ücret - ((ücret * 50) / 100));
            if (yltipi == 2) {
                ücret = ((ücret - ((ücret * 20) / 100))) * 2;
                System.out.println("Toplam Tutar:" + ücret + "TL");
            } else if (yltipi == 1) {

                System.out.println("Toplam Tutar:" + ücret + "TL");
            } else System.out.println("Hatalı Veri Girdiniz");

        } else if (yasi >= 12 && yasi <= 24) {
            ücret = (ücret - ((ücret * 10) / 100));
            if (yltipi == 2) {
                ücret = ((ücret - ((ücret * 20) / 100))) * 2;
                System.out.println("Toplam Tutar:" + ücret + "TL");
            } else if (yltipi == 1) {

                System.out.println("Toplam Tutar:" + ücret + "TL");
            } else System.out.println("Hatalı Veri Girdiniz");

        } else if (yasi >= 65) {

            ücret = (ücret - ((ücret * 30) / 100));
            if (yltipi == 2) {
                ücret = ((ücret - ((ücret * 20) / 100))) * 2;
                System.out.println("Toplam Tutar:" + ücret + "TL");
            } else if (yltipi == 1) {

                System.out.println("Toplam Tutar:" + ücret + "TL");
            } else System.out.println("Hatalı Veri Girdiniz");

        } else {
            ücret = km * 0.10;
            if (yltipi == 2) {
                ücret = ((ücret - ((ücret * 20) / 100))) * 2;
                System.out.println("Toplam Tutar:" + ücret + "TL");
            } else if (yltipi == 1) {

                System.out.println("Toplam Tutar:" + ücret + "TL");
            }
        }

    }
}
