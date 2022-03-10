import java.util.Scanner;

public class EbobEkokbulma {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci Sayıyı giriniz:");
        n1 = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        n2 = sc.nextInt();
        int ebob = 0,ekok=0;
        if (n1 <= n2) {
            for (int i = 1; i <= n1; i++) {

                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("Ebob=" + ebob);
        } else {
            for (int i = 1; i <= n2; i++) {
                if (n2 % i == 0 && n1 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("Ebob=" + ebob);
        }
        ekok=(n1*n2)/ebob;
        System.out.println("Ekok="+ekok);
    }
}
