import java.util.Scanner;

public class mukemmelsayibulma {
    public static void main(String[] args) {
        int sayi;
        Scanner sc = new Scanner(System.in);

        int toplam = 0;
        int x;
        do {
            System.out.print("Bir sayı giriniz:");
            sayi = sc.nextInt();
            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam = toplam + i;
                }
            }
            if (sayi == toplam) {
                System.out.println(sayi + " " + "Mükemmel sayidir");
            } else {
                System.out.println("Mükemmel sayı degildir.");

            }

        }
        while (sayi > 0);
        return;


    }
}
