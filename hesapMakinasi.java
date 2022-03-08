import java.util.Scanner;

public class hesapMakinasi {
    public static void main(String[] args) {

        double x, y;
        int islem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        x = sc.nextDouble();
        System.out.print("İkinci sayıyı giriniz:");
        y = sc.nextDouble();
        System.out.println(" 1-Toplama\n 2-Çıkarma\n 3-Bölme\n 4-Çarpma");
        System.out.print("İŞLEM SEÇİNİZ:");
        islem = sc.nextInt();
        switch (islem) {
            case 1:
                System.out.println("İki sayının Toplamları:" + (x + y));
                break;
            case 2:
                System.out.println("İki sayının Çıkarmaları:" + (x - y));
                break;
            case 3:
                System.out.println("İki sayının Bölmeleri:" + (x / y));
                break;
            case 4:
                System.out.println("İki sayının Çarpmaları:" + (x * y));
                break;
            default:
                System.out.println("Geçerli Bir sayı giriniz.");
                break;

        }
    }
}
