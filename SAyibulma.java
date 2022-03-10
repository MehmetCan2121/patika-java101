import java.util.Scanner;

public class SAyibulma {
    public static void main(String[] args) {
        int sayi,top=0,j=0;
        double ortalama;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sayı Giriniz:");
        sayi= sc.nextInt();
        for (int i=1;i<=sayi;i++){
            if (i % 12 == 0){
                top=top+i;
                ++j;
            }
            else
            {continue;}
        }
        System.out.println("sayıların toplamı:"+top);
        ortalama=top/j;
        System.out.println("Sayıların ortalaması:"+ortalama);
    }
}
