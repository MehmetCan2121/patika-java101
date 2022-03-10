import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
        int a;
        System.out.println("1 ile 100 arasındaki sayıları bulan program");
        for (int i = 2; i <= 100; i++) {
            int sayac = 0;
            for (int j = 1; j < i; j++) {

                if (i % j == 0) {
                    sayac++;
                }

            }

            if (sayac <= 1) {
                System.out.print(i + " ");
            }

        }
    }
}
