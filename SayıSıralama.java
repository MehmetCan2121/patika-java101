import java.util.Scanner;

public class SayıSıralama {
    public static void main(String[] args) {
        int a, b, c;
        int eb = 1000000;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Sayıyı Giriniz:");
        a = sc.nextInt();
        System.out.println("2.Sayıyı Giriniz:");
        b = sc.nextInt();
        System.out.println("3.Sayıyı Giriniz:");
        c = sc.nextInt();
        if (a > b && a > c) {
            if (b > c) {
                System.out.println("a>b>c:" );
            } else {
                System.out.println("a>c>b" );
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("b>a>c:");
            } else {
                System.out.println("b>c>a:");
            }
        } else if (b > a) {
            System.out.println("c>b>a");
        } else if (a > b) {
            System.out.println("c>a>b");
        }

    }
}
