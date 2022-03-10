import java.util.Scanner;

public class banka {
    public static void main(String[] args) {
        String kadi, sifre;
        Scanner sc = new Scanner(System.in);
        int right = 3;
        int bakiye = 1500, değer, tutar, tutar2;
        while (right > 0) {
            System.out.println("Kullanıcı Adınız:");
            kadi = sc.nextLine();
            System.out.println("Şifre girinizz:");
            sifre = sc.nextLine();
            if (kadi.equals("Mehmet") && sifre.equals("12345")) {
                System.out.println("Merhaba Bankamıza hoşgeldiniz.");
                do {

                    System.out.println("1-Para yatırma\n" + "2-Para Çekme\n" + "3-Bakiye sorgula\n" + "4-Çıkış yap\n");
                    System.out.println("Lütfen yapmak istediğiniz işlemi giriniz:");
                    değer = sc.nextInt();
                    switch (değer) {
                        case 1:
                            System.out.println("Yatırılacak tutarı giriniz:");
                            tutar = sc.nextInt();
                            bakiye = bakiye + tutar;
                            System.out.println("Paranız yatırıldı");
                        case 2:
                            System.out.println("Çekmek istediğinz tutarı giriniz:");
                            tutar2 = sc.nextInt();
                            if (tutar2 <= bakiye) {
                                bakiye = bakiye - tutar2;
                                System.out.println("Paranız Çekildi");
                            } else {
                                System.out.println("Hesabınızda o kadar para yok üzgünüz.");
                            }
                        case 3:
                            System.out.println("Bakiyeniz:" + bakiye+"TL");

                    }

                }
                while (değer != 4);
                System.out.println("Tekrardan görüşmek üzere");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı şifre. Tekrardan deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                } else {
                    System.out.println("Kalan haklarınız:" + " " + right);
                }

            }
        }


    }
}
