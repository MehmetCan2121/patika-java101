import java.sql.SQLOutput;
import java.util.Scanner;

public class kullanıcıgirisi {
    public static void main(String[] args) {
        String username = "Mehmetcan";
        String password = "12345";

        String a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz:");
        a = sc.nextLine();
        System.out.print("Şifrenizi Giriniz:");
        b = sc.nextLine();
        if (a.equals(username) && b.equals(password)) {
            System.out.println("Giriş Yaptınız");

        } else if (!a.equals(username) && b.equals(password)) {

            System.out.println("Kullanıcı Adı Yanlış");
        } else if (a.equals(username) && !b.equals(password)) {

            System.out.println("Şifre Yanlış! Şifrenizi sıfırlamak isityormusunuz?(e/h): ");

        }
        else {System.out.println("Kullanıcı adı ve şifre yanlış");}
        c = sc.nextLine();
        if (c.equals("h")) {
            System.out.println("Şifre değiştirilmedi, Giriş Yap:");
        }
            else {
                System.out.println("Yeni şifre:");
                String yenisifre = sc.nextLine();
                if (yenisifre.equals(password)) {
                    System.out.println("Şifre oluşturulmadı");
                }
                else {
                    System.out.println("Şifre oluşturuldu");
                }
        }



    }
}
