import java.util.Scanner;

public class yıldızlar {
    public static void main(String[] args) {
        int satır;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        satır = sc.nextInt();
        for (int i = 0; i <= satır; i++) {

            for (int j = 0; j < (satır - i); j++) {

                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) + 1; k++) {

                System.out.print("*");
            }

           System.out.println(" ");

        }

        for (int i=1;i<satır;i++){
            for (int k=0;k<(i+1);k++){
                System.out.print(" ");
            }
            for (int j=1;j<(2*(satır-i));j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }

