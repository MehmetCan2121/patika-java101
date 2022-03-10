import java.util.Scanner;

public class ornek1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sayi;
        do {
            System.out.println("Sayı Girinniz:");
            sayi=sc.nextInt();

        }while (sayi>0);
        System.out.println("Negatif sayı girfdiniz program bitti");
    }
}
