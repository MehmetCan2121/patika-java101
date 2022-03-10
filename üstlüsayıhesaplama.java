import java.util.Scanner;

public class üstlüsayıhesaplama {
    public static void main(String[] args) {
        int a,b,top=1;

        Scanner sc=new Scanner(System.in);
        System.out.println("Sayı Giriniz:");
        a=sc.nextInt();
        System.out.println("Üssünü Giriniz:");
        b=sc.nextInt();
        for (int i=1;i<=b;i++){
            top=top*a;
        }
        System.out.println("Sonuç:"+top);
    }
}
