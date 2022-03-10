import java.util.Scanner;

public class Teksayilarintop {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Sayı Giriniz:");
            n = sc.nextInt();
            if (n % 4 == 0) {
                total=total+n;
            }

        } while (n % 2 == 0 );
        System.out.println("Girilen sayılardan 4'ün katı olanların toplamı:"+total);
    }
}
