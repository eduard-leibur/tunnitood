import java.util.Scanner;

public class ESIMENE {
    public static void main(String[] args) {
        Scanner sisse = new Scanner(System.in);
        System.out.print("Sisestage kolmnurga küljed: ");
        int a, b, c;
        a = sisse.nextInt();
        b = sisse.nextInt();
        c = sisse.nextInt();
        sisse.close();

        boolean kontroll = (a + b) > c && (a + c) > b && (b + c) > a;
        System.out.println(kontroll);
    }
}
