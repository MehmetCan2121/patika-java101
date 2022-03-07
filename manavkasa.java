import java.util.Scanner;

public class manavkasa {
    public static void main(String[] args) {
        int a,b,c,d,e;
        double sonuc;
        Scanner sc=new Scanner(System.in);
        System.out.println("Armut Kaç Kilo:");
        a=sc.nextInt();
        System.out.println("Elma Kaç Kilo:");
        b=sc.nextInt();
        System.out.println("Domates Kaç Kilo:");
        c=sc.nextInt();
        System.out.println("Muz Kaç Kilo:");
        d=sc.nextInt();
        System.out.println("Patlıcan Kaç Kilo:");
        e=sc.nextInt();
        sonuc=(a*2.14)+(b*3.67)+(c*1.11)+(d*0.95)+(e*5);
        System.out.println("Toplam ödiyecek tutar:"+sonuc);

    }
}
