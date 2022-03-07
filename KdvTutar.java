
import java.util.Scanner;

public class KdvTutar {
    public static void main(String[] args) {
        double para;
        double kdvtutar, kdvfiyat;
        Scanner sc = new Scanner(System.in);
        System.out.println("Para degerini Giriniz:");
        para = sc.nextInt();
        if (para > 0 && para < 1000) {
            kdvfiyat = para + (para * 18) / 100;
            kdvtutar = kdvfiyat - para;
            System.out.println("Kdv'siz Fiyat:" + para);
            System.out.println("KDV'li Fiyat:" + kdvfiyat);
            System.out.println("KDV tutarı:" + kdvtutar);
        } else if (para > 1000) {
            kdvfiyat = para + (para * 8) / 100;
            kdvtutar = kdvfiyat - para;
            System.out.println("Kdv'siz Fiyat:" + para);
            System.out.println("KDV'li Fiyat:" + kdvfiyat);
            System.out.println("KDV tutarı:" + kdvtutar);
        } else {
            System.out.println("Girdiginiz deger yanlış");
        }

    }
}
