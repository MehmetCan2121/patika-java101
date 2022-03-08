import java.util.Scanner;

public class sınıfgeçme {
    public static void main(String[] args) {
        int a, b, c, d, e;
        double ort = 0, toplam;
        int sayac = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Matematik notu giriniz:");
        a = sc.nextInt();
        System.out.print("Fizik notu giriniz:");
        b = sc.nextInt();
        System.out.print("Türkçe notu giriniz:");
        c = sc.nextInt();
        System.out.print("Kimya notu giriniz:");
        d = sc.nextInt();
        System.out.print("Müzik notu giriniz:");
        e = sc.nextInt();
        if (a > 0 && a <= 100) {
            ort = ort + a;
            sayac++;
        }
        if (b > 0 && b <= 100) {
            ort = ort + b;
            sayac++;
        }
        if (c > 0 && c <= 100) {
            ort = ort + c;
            sayac++;
        }
        if (d > 0 && d <= 100) {
            ort = ort + d;
            sayac++;
        }
        if (e > 0 && e <= 100) {
            ort = ort + e;
            sayac++;
        }
        toplam = ort / sayac;
        if (toplam >= 55) {
            System.out.println("Tebrikler sınıfı geçtiniz ortalamanız:" + toplam);
        } else {
            System.out.println("Malesef sınıfta kaldınız ortalamanız:" + toplam);
        }


    }
}
