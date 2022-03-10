import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {
        int n;
        double top = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        n = sc.nextInt();
        for (double i = 1; i <= n; i++) {
            double b = 1 / i;
            top = top + b;
        }
        System.out.println("Girilen sayının harmonik ortalaması:"+top);

    }
}
