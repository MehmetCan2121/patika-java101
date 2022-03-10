import java.util.Scanner;

public class kombinasyonhesaplama {
    public static void main(String[] args) {
        int n,r,fak=1,fak1=1,fak3=1,fark;
        int sonuc;
        Scanner sc=new Scanner(System.in);
        System.out.println("Elaman Sayısını giriniz:");
        n=sc.nextInt();
        System.out.println("Kombinasyonu alınacak sayıyı giriniz:");
        r=sc.nextInt();
        for (int i=1;i<=n;i++){
            fak=fak*i;
        }
        for (int j=1;j<=r;j++){
            fak1=fak1*j;
        }
        fark=n-r;
        for (int k=1;k<=fark;k++){
            fak3=fak3*k;
        }
        sonuc=(fak/(fak1*fak3));
        System.out.println("Kombinasyonları:"+sonuc);
    }
}
