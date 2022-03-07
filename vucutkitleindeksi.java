import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class vucutkitleindeksi {
    public static void main(String[] args) {

        double sonuc,a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Boyunuzu Giriniz:");
        a=sc.nextDouble();
        System.out.println("Kilonuzu Giriniz:");
        b=sc.nextDouble();
        sonuc=(b/(a*a));
        System.out.println("Vücut kitle indeksiniz:"+sonuc);
        if (sonuc>30){
            System.out.println("Şişmansnızzz");
        }
        else if (sonuc<30 && sonuc>20){
            System.out.println("Normalsinizzz");
        }
        else {
            System.out.println("Zayıfsınızz..");
        }
    }
}
