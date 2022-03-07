import java.util.Scanner;

public class HipotenüsBulma {
    public static void main(String[] args) {
        int a,b;
        double hipotenüs,top;
        Scanner sc= new Scanner(System.in);
        System.out.println("Birinci dik kenarı Giriniz:");
        a=sc.nextInt();
        System.out.println("İkinci Dik Kenarı Giriniz:");
        b=sc.nextInt();
        top=(a*a)+(b*b);
        hipotenüs=Math.sqrt(top);
        System.out.println("Hipotenüs uzunlugu:"+hipotenüs);
    }
}
