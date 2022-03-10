import java.util.Scanner;

public class kuvvetlerinibulma {
    public static void main(String[] args) {
        int sayi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı Giriniz:");
        sayi = sc.nextInt();
        System.out.println("Beşin Katları");
        for (int i = 1; i <= sayi; i=i*5) {

            System.out.print(+i+",");
        }
        System.out.println("");
        System.out.println("Dördün katları");
        for (int j=1;j<=sayi;j=j*4){

            System.out.print(+j+",");

        }



    }
}
