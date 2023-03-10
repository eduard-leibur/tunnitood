import java.util.Arrays;
import java.util.Scanner;

public class PEO_EELARVE {
    static int eelarve(int külalisi) {
        return külalisi * 10 + 55;
    }
    public static void main(String[] args) {
        Scanner sisse = new Scanner(System.in);
        System.out.print("Mitu külalist on kutsutud? ");
        int mitu = sisse.nextInt();
        sisse.nextLine();
        System.out.print("Informatsioon külaliste kohta: ");
        String[] info = sisse.nextLine().split(", ");
        System.out.println("Info: " + Arrays.toString(info));
        sisse.close();
        // ? Anna, + Peeter, + Ülle, ? Eva, ? Juhan, + Maria, + Epp

    }
}
