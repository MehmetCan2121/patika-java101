import java.util.Scanner;

public class DaireAlanödev {
    public static void main(String[] args) {
        int çap,açı;
        double sonuc,pi=3.14;
        Scanner sc= new Scanner(System.in);
        System.out.println("Yarıçapı Giriniz:");
        çap=sc.nextInt();
        System.out.println("Meerkez Açı ölçüsünü giriniz: ");
        açı=sc.nextInt();
        sonuc=(pi*(çap*çap)*açı)/360;
        System.out.println("Dairenin alanı:"+sonuc);
    }
}
