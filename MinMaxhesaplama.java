import java.util.Scanner;

public class MinMaxhesaplama {
    public static void main(String[] args) {
        int a, b;
        int eb = 0, ek = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz:");
        a = sc.nextInt();


        if (a >= 2) {
            for (int i = 1; i <= a; i++) {
                System.out.println(i + "." + "Sayıyı giriniz:");
                b = sc.nextInt();
                if (i == 1) {
                    eb = b;
                    ek = b;
                } else {
                    if (a >= eb) {
                        eb = b;
                    }
                    if (a <= ek) {
                        ek = b;
                    }
                }

            }
            System.out.println("Enbüyük deger:" + eb);
            System.out.println("En Küçük deger:" + ek);


        }
        else{System.out.println("Eksik girdiniz.");}

    }
}
