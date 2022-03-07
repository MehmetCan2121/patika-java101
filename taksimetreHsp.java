import java.util.Scanner;

public class taksimetreHsp {
    public static void main(String[] args) {
        int km;
        double tutar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kilometreyi Giriniz:");
        km=sc.nextInt();
        tutar=10+km*2.20;
        tutar =(tutar<20) ? 20: tutar;
        System.out.println("Ödenecek Tutar:"+tutar);
    }
}
