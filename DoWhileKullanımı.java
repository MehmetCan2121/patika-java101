import java.util.Scanner;

public class DoWhileKullanımı {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sifre;
        boolean askPasword=true;
        do {
            System.out.println("Şifre Giriniz:");
            sifre= sc.nextInt();
            if (sifre==1234){
                System.out.println("Doğru");
                askPasword=false;
            }
            else {
                System.out.println("Yanlış");
            }
        }
        while (askPasword);
    }
}
