import java.util.Scanner;

public class whilekullanıcıgirisi {
    public static void main(String[] args) {
        int pasword;
        boolean sifre=false;
        Scanner sc =new Scanner(System.in);
        while(!sifre){
            System.out.println("Şifre Giriniz:");
            pasword=sc.nextInt();
            if (pasword == 123){
                System.out.println("Dogru Girdiniz Şifreyi");
                sifre = true;
            }
            else{
                System.out.println("Şifre yanlış");
            }

        }
    }
}
