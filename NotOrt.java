import java.util.Scanner;

public class NotOrt {
    public static void main(String[] args) {

        int a,b,c,d,e,f;
        double sonuc;

        Scanner sc=new Scanner(System.in);
        System.out.print("Matematik notunu gir:");
        a=sc.nextInt();

        System.out.print("Fizik notunu gir:");
        b=sc.nextInt();

        System.out.print("Kimya notunu gir:");
        c=sc.nextInt();

        System.out.print("Türkçe notunu gir:");
        d=sc.nextInt();

        System.out.print("Tarih notunu gir:");
        e=sc.nextInt();

        System.out.print("Müzik notunu gir:");
        f=sc.nextInt();

        sonuc=(a+b+c+d+e+f)/6;

        String durum = (sonuc<55) ?  "Kaldı" : "Geçti";
        System.out.println("Ortalama:"+sonuc+" ** "+durum);


    }
}
