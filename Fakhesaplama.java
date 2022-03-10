import java.util.Scanner;

public class Fakhesaplama {
    public static void main(String[] args) {
        int a, fak=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("FAktoriyeli hesaplanacak sayıyı giriniz:");
        a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            fak = fak * i;
        }
        System.out.println("faktoriyeli:" + fak);
    }
}
