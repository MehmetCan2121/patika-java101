import java.util.Scanner;

public class havasicakligi {
    public static void main(String[] args) {
        int derece;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sıcaklıgı giriniz:");
        derece=sc.nextInt();
        if (derece<5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if (derece>=5 || derece<=25){
            if (derece<=15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (derece>=10){
                System.out.println("Pikniğe gidebilirsiniz.");
            }

        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }


}
