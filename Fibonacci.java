import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int sayi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Eleman sayısı giriniz:");
        sayi = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i=1;i<=sayi;i++){
            System.out.println(c+" ");
            a=b;
            b=c;
            c=a+b;
        }

    }
}
