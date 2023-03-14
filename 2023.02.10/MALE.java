import java.util.Scanner;

public class MALE {
    public static void main(String[] args) {
        Scanner sisse = new Scanner(System.in);
        System.out.print("Sisestage täisarv: ");
        int arv = sisse.nextInt();
        sisse.nextLine();

        int teri = (int) (Math.pow(2, arv - 1));
        System.out.println(teri);
    }
}
