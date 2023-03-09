import java.util.Scanner;

public class KORRUTUSTABEL {
    public static void main(String[] args) {
        Scanner sisse = new Scanner(System.in);
        System.out.print("Sisestage arv: ");
        short arv = sisse.nextShort();
        sisse.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(arv + " * " + i + " = " + (arv * i));
        }
    }
}
