import java.util.Scanner;

public class swithcase {
    public static void main(String[] args) {

        int day;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 iel 7 arasında bir sayı giriniz:");
        day = sc.nextInt();
        switch (day)
        {
            case 1:
                System.out.println("Bugun pazartesi");
                System.out.println("Program bitti");
                break;
            case 2:
                System.out.println("Bugun salı");
                System.out.println("Program bitti");
                break;
            case 3:
                System.out.println("Bugun Çarşamba");
                System.out.println("Program bitti");
                break;
            case 4:
                System.out.println("Bugun Perşembe");
                System.out.println("Program bitti");
                break;
            case 5:
                System.out.println("Bugun Cuma");
                System.out.println("Program bitti");
                break;
            case 6:
                System.out.println("Bugun cumartesi");
                System.out.println("Program bitti");
                break;
            case 7:
                System.out.println("Bugun pazar");
                System.out.println("Program bitti");
                break;
            default:
                System.out.println("Yanlış bir sayı girdiniz....");
                break;
        }

    }
}
