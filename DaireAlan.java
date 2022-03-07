import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        int çap;
        Double pi=3.14,alan,çevre;
        Scanner sc =new Scanner(System.in);
        System.out.println("Yarı Çapı Giriniz:");
        çap=sc.nextInt();
        alan=pi*çap*çap;
        çevre=2*pi*çap;
        System.out.println("Dairenin Alanı:"+alan);
        System.out.println("Dairenin Çevresi:"+çevre);
    }
}
