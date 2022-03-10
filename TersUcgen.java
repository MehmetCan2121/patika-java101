import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int sayi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Basamk sayısını giriniz:");
        sayi = sc.nextInt();
        int a;
        for ( a = 1; a < sayi; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= 2 * (sayi - a) - 1; c++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }
}

