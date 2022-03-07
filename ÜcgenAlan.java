import java.util.Scanner;

public class ÜcgenAlan {
    public static void main(String[] args) {
        int a,b,c;
        double cevre,alan,sonuc;
        Scanner sc =new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz:");
        a=sc.nextInt();
        System.out.println("İkinci Kenarı giriniz:");
        b=sc.nextInt();
        System.out.println("Üçüncü Kenarı giriniz:");
        c=sc.nextInt();
        cevre=((a+b+c)/2);
        alan=cevre*(cevre-a)*(cevre-b)*(cevre-c);
        sonuc=Math.sqrt(alan);
        //System.out.println("Üçgenin Çevresi:"+cevre);
        System.out.println("Üçgenin Alanı:"+sonuc);



    }
}
