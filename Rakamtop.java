import java.util.Scanner;

public class Rakamtop {
    public static void main(String[] args) {
        int a,top=0,rakam;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sayı Giriniz:");
        a=sc.nextInt();

        while (a!=0){
            rakam=a%10;
            top=top+rakam;
            a=a/10;
        }
        System.out.println("Rakamlar toplamı:"+top);
    }
}
